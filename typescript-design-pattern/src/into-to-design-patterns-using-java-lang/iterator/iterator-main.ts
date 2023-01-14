import Output from '../../utils/stdin-stdout/output'
import Book from './book'
import BookShelf from './book-shelf'
import { Iterator } from './iterator'

const iteratorMain = () => {
  const bookShelf: BookShelf = new BookShelf()
  bookShelf.appendBook(new Book('Around the World in 80 days'))
  bookShelf.appendBook(new Book('Bible'))
  bookShelf.appendBook(new Book('Cinderella'))
  bookShelf.appendBook(new Book('Daddy-Long-Legs'))

  const it: Iterator<Book> = bookShelf.iterator()
  while (it.hasNext()) {
    const book: Book = it.next()
    Output.log(book.name)
  }
  Output.log()

  const books: Book[] = bookShelf.books
  for (const book of books) {
    Output.log(book.name)
  }
  Output.log()
}

export default iteratorMain
