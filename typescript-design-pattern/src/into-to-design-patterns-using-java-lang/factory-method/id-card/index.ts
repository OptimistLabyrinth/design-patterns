import Output from '../../../utils/stdin-stdout/output'
import { Product } from '../framework/product'

export default class IdCard implements Product {
  private readonly _owner: string

  constructor(owner: string) {
    Output.dir({ '->': 'created credit card of ', owner })
    this._owner = owner
  }

  use(): void {
    Output.dir({ '->': 'using ', product: this })
  }
}
