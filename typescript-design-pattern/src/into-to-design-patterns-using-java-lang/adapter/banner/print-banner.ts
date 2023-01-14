import Banner from './banner'
import { Print } from './print'

export default class PrintBanner implements Print {
  private readonly _banner: Banner

  constructor(message: string) {
    this._banner = new Banner(message)
  }

  printWeak() {
    this._banner.showWithParen()
  }

  printStrong() {
    this._banner.showWithAstr()
  }
}
