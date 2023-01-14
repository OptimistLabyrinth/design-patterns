import Output from '../../utils/stdin-stdout/output'
import CreditCardFactory from './credit-card/credit-card-factory'
import Factory from './framework/factory'
import { Product } from './framework/product'
import IdCardFactory from './id-card/id-card-factory'

const factoryMethodMain = () => {
  const idCardFactory: Factory = new IdCardFactory()
  const creditCardFactory: Factory = new CreditCardFactory()
  const cards: Product[] = []
  cards.push(idCardFactory.create('Youngjin Kim'))
  cards.push(idCardFactory.create('Heunmin Son'))
  cards.push(creditCardFactory.create('Kane Watson'))
  cards.push(creditCardFactory.create('Draco Malfoy'))
  cards.push(creditCardFactory.create('John Doe'))
  Output.log()

  cards.forEach((card) => card.use())
}

export default factoryMethodMain
