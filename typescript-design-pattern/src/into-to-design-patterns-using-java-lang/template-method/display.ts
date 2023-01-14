export default abstract class Display {
  private static readonly loopCount: number = 5
  protected abstract open(): void
  protected abstract print(): void
  protected abstract close(): void

  display() {
    this.open()
    for (let i = 0; i < Display.loopCount; ++i) {
      this.print()
    }
    this.close()
  }
}
