import Input from '../stdin-stdout/input'
import Output from '../stdin-stdout/output'
// eslint-disable-next-line @typescript-eslint/no-unused-vars
import internalIteratorMain from './internal-iterator/internal-iterator-main'
import iteratorMain from './iterator/iterator-main'

const main = async () => {
  const answer = await Input.question(`Select design pattern
  1. Iterator
=> `)
  const answerLower = answer.trim().toLocaleLowerCase()
  switch (answerLower) {
    case '1':
    case 'iterator':
      iteratorMain()
      // internalIteratorMain()
      break

    default:
      Output.print('You selected wrong design pattern')
  }
  Input.close()
}

const introToDesignPatternsUsingJavaLang = {
  main,
}

export default introToDesignPatternsUsingJavaLang
