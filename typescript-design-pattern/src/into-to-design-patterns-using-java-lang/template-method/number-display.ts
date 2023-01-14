import Display from './display'
import ResultString from './result-string'

export default class NumberDisplay extends Display {
  private readonly value: number
  private readonly fileStore: ResultString

  constructor(value: number, fileStore: ResultString) {
    super()
    this.value = value
    this.fileStore = fileStore
    this.fileStore.start('NumberDisplay')
  }

  protected open(): void {
    this.fileStore.write('<<')
  }

  protected print(): void {
    this.fileStore.write(` ${this.value}`)
  }

  protected close(): void {
    this.fileStore.write(' >>')
  }
}
