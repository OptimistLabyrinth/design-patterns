import Output from '../../../utils/stdin-stdout/output'
import Factory from '../framework/factory'
import { Product } from '../framework/product'
import IdCard from '.'

export default class IdCardFactory extends Factory {
  createProduct(owner: string): Product {
    return new IdCard(owner)
  }

  registerProduct(product: Product): void {
    Output.dir({ '->': 'now registered ', product })
  }
}
