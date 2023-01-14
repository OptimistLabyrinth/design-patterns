import Display from './display'
import ResultString from './result-string'

export default class StringDisplay extends Display {
  private readonly value: string
  private readonly width: number
  private readonly fileStore: ResultString

  constructor(value: string, fileStore: ResultString) {
    super()
    this.value = value
    this.width = value.length
    this.fileStore = fileStore
    this.fileStore.start('StringDisplay')
  }

  private printLine(): void {
    this.fileStore.write('+')
    for (let i = 0; i < this.width + 2; ++i) {
      this.fileStore.write('-')
    }
    this.fileStore.write('+')
  }

  open(): void {
    this.printLine()
    this.fileStore.write('\n')
  }

  print(): void {
    this.fileStore.write(`| ${this.value} |\n`)
  }

  close(): void {
    this.printLine()
  }
}
