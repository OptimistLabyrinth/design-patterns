import Factory from '../framework/factory'
import { Product } from '../framework/product'
import Output from '../../../utils/stdin-stdout/output'
import CreditCard from '.'

export default class CreditCardFactory extends Factory {
  protected createProduct(owner: string): Product {
    return new CreditCard(owner)
  }

  protected registerProduct(product: Product): void {
    Output.dir({ '->': 'now registered ', product })
  }
}
