import path from 'path'
import fs from 'fs/promises'

export default class ResultString {
  private fileName = 'result.txt'
  private _value: string

  constructor() {
    this._value = ''
  }

  start(moduleName: string) {
    this._value = this._value + `# ${moduleName}\n`
  }

  write(value: string) {
    this._value = this._value + value
  }

  end() {
    this._value = this._value + '\n'
  }

  async save() {
    const fullPath = path.resolve(__dirname, this.fileName)
    return fs.writeFile(fullPath, this._value)
  }
}
