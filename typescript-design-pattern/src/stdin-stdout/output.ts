export default class Output {
  static print(message?: string) {
    if (message) {
      console.log(message)
      return
    }
    console.log('')
  }
}
