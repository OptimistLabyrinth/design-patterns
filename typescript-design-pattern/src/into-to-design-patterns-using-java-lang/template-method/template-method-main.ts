import Display from './display'
import NumberDisplay from './number-display'
import ResultString from './result-string'
import StringDisplay from './string-display'

const templateMethodMain = () => {
  const resultString: ResultString = new ResultString()
  const d1: Display = new NumberDisplay(777, resultString)
  d1.display()
  resultString.write('\n')
  resultString.end()

  const d2: Display = new StringDisplay('Hello, World!', resultString)
  d2.display()
  resultString.end()
  resultString.save()
}

export default templateMethodMain
