import Output from '../../utils/stdin-stdout/output'
import Book from './book'
import BookShelf from './book-shelf'

const internalIteratorMain = () => {
  const bookShelf: BookShelf = new BookShelf()
  bookShelf.appendBook(new Book('Around the World in 80 days'))
  bookShelf.appendBook(new Book('Bible'))
  bookShelf.appendBook(new Book('Cinderella'))
  bookShelf.appendBook(new Book('Daddy-Long-Legs'))

  // ! iterator not properly working
  // ! iterator not properly working
  // ! iterator not properly working
  for (const book of bookShelf) {
    Output.logString(book.name)
  }
  Output.logString()
  // ! iterator not properly working
  // ! iterator not properly working
  // ! iterator not properly working

  const iterator = bookShelf[Symbol.iterator]()
  let result = iterator.next()
  let book = result.value
  do {
    Output.logString(book.name)
    result = iterator.next()
    book = result.value
    if (result.done) {
      Output.logString(`haha ${book.name}`)
      break
    }
  } while (!result.done)
  Output.logString()
}

export default internalIteratorMain
