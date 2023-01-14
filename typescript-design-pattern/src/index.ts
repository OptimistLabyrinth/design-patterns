import introToDesignPatternsUsingJavaLang from './into-to-design-patterns-using-java-lang'
import Input from './utils/stdin-stdout/input'

const main = async () => {
  introToDesignPatternsUsingJavaLang.main()
}

process.on('exit', () => {
  Input.close()
})

main()
