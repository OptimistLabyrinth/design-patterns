import Output from '../../../utils/stdin-stdout/output'
import { Print } from './print'
import PrintBanner from './print-banner'

const adapterBannerMain = () => {
  const print: Print = new PrintBanner('adapter design pattern')
  print.printWeak()
  print.printStrong()
  Output.log()
}

export default adapterBannerMain
