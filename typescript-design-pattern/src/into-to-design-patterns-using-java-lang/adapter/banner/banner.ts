import Output from '../../../utils/stdin-stdout/output'

export default class Banner {
  private readonly _message: string

  constructor(message: string) {
    this._message = message
  }

  showWithParen() {
    Output.log(`( ${this._message} )`)
  }

  showWithAstr() {
    Output.log(`* ${this._message} *`)
  }

  get message() {
    return this._message
  }
}
