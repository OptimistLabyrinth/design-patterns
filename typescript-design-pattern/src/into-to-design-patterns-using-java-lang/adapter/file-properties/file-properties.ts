import fs from 'fs/promises'
import path from 'path'
import os from 'os'
import { DateTime } from '../../../utils/date-time'
import DayjsDateTime from '../../../utils/date-time/dayjs-date-time'
import { FileIO } from './file-io'

export default class FileProperties implements FileIO {
  private static readonly propertySplitDelimiter: string = ': '
  private readonly properties: Map<string, string>

  constructor() {
    this.properties = new Map<string, string>()
  }

  private absoluteFileName(fileName: string): string {
    return path.resolve(__dirname, fileName)
  }

  private lineSplitDelimiter(): string {
    if (os.platform() === 'win32') {
      return '\r\n'
    }
    return '\n'
  }

  async readFromFile(fileName: string) {
    const pathToFile = this.absoluteFileName(fileName)
    const buffer = await fs.readFile(pathToFile)
    const fileContent = buffer.toString()
    const lines = fileContent.split(this.lineSplitDelimiter())
    for (const line of lines) {
      const tokens = line.split(FileProperties.propertySplitDelimiter)
      if (tokens.length !== 2) {
        continue
      }
      this.properties.set(tokens[0], tokens[1])
    }
  }

  async writeToFile(fileName: string) {
    const pathToFile = this.absoluteFileName(fileName)
    let fileContent = '# written by FileProperties\n'
    const dateTime: DateTime = new DayjsDateTime()
    fileContent = fileContent + `# ${dateTime.getTodayString()}\n`
    for (const [ key, value ] of this.properties) {
      fileContent = fileContent + `${key}: ${value}\n`
    }
    return fs.writeFile(pathToFile, fileContent)
  }

  setValue(key: string, value: string) {
    this.properties.set(key, value)
  }

  getValue(key: string): string {
    const value = this.properties.get(key)
    if (!value) {
      throw new Error('no such element')
    }
    return value
  }
}
