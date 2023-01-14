import Input from '../utils/stdin-stdout/input'
import Output from '../utils/stdin-stdout/output'
import adapterBannerMain from './adapter/banner/adapter-banner-main'
import adapterFileProperties from './adapter/file-properties/adapter-file-properties'
import internalIteratorMain from './internal-iterator/internal-iterator-main'
import iteratorMain from './iterator/iterator-main'
import templateMethodMain from './template-method/template-method-main'

const main = async () => {
  const answer = await Input.question(`Select design pattern
  1. Iterator
  2. Iterator Internal
  3. Adapter Print Banner
  4. Adapter File Properties
  5. Template Method
=> `)
  const answerLower = answer.trim().toLocaleLowerCase()
  switch (answerLower) {
    case '1':
    case 'iterator':
    case 'iterator 1':
    case 'pattern 1':
      iteratorMain()
      // internalIteratorMain()
      break

    case '2':
    case 'iterator internal':
    case 'iterator 2':
    case 'pattern 2':
      internalIteratorMain()
      break

    case '3':
    case 'adapter print banner':
    case 'adapter 3':
    case 'pattern 3':
      adapterBannerMain()
      break

    case '4':
    case 'adapter file properties':
    case 'adapter 4':
    case 'pattern 4':
      adapterFileProperties()
      break

    case '5':
    case 'template method':
    case 'template method 5':
    case 'pattern 5':
      templateMethodMain()
      break

    default:
      Output.log('You selected a wrong option')
  }
  Input.close()
}

const introToDesignPatternsUsingJavaLang = {
  main,
}

export default introToDesignPatternsUsingJavaLang
