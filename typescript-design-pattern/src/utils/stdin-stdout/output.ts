export default class Output {
  static logString(message?: string) {
    if (message) {
      console.log(message)
      return
    }
    console.log('')
  }

  static logObject(object: object) {
    console.log(object)
  }

  static dirObject(object: object) {
    console.dir(object)
  }
}
