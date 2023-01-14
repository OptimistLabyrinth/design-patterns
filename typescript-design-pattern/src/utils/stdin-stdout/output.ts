export default class Output {
  static log(value?: unknown) {
    if (value) {
      console.log(value)
      return
    }
    console.log('')
  }

  static dir(object: object) {
    console.dir(object)
  }
}
