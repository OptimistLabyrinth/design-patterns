import Input from '../utils/stdin-stdout/input'
import Output from '../utils/stdin-stdout/output'
import adapterBannerMain from './adapter/banner/adapter-banner-main'
import adapterFileProperties from './adapter/file-properties/adapter-file-properties'
import internalIteratorMain from './internal-iterator/internal-iterator-main'
import iteratorMain from './iterator/iterator-main'

const main = async () => {
  const answer = await Input.question(`Select design pattern
  1. Iterator
  2. Iterator Internal
  3. Adapter Print Banner
  4. Adapter File Properties
=> `)
  const answerLower = answer.trim().toLocaleLowerCase()
  switch (answerLower) {
    case '1':
    case 'iterator':
    case 'iterator 1':
      iteratorMain()
      // internalIteratorMain()
      break

    case '2':
    case 'iterator internal':
    case 'iterator 2':
      internalIteratorMain()
      break

    case '3':
    case 'adapter print banner':
    case 'adapter 3':
      adapterBannerMain()
      break

    case '4':
    case 'adapter file properties':
    case 'adapter 4':
      adapterFileProperties()
      break

    default:
      Output.logString('You selected a wrong option')
  }
  Input.close()
}

const introToDesignPatternsUsingJavaLang = {
  main,
}

export default introToDesignPatternsUsingJavaLang
