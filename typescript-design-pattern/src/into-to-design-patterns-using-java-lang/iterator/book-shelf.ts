import Book from './book'
import BookShelfIterator from './book-shelf-iterator'
import { Iterable } from './iterable'
import { Iterator } from './iterator'

export default class BookShelf implements Iterable<Book> {
  private readonly _books: Book[]

  constructor() {
    this._books = []
  }

  getBookAt(index: number): Book {
    const book = this._books.at(index)
    if (!book) {
      throw new Error(`index ${index} out of range`)
    }
    return book
  }

  appendBook(book: Book): void {
    this._books.push(book)
  }

  length(): number {
    return this._books.length
  }

  iterator(): Iterator<Book> {
    return new BookShelfIterator(this)
  }

  get books(): Book[] {
    return this._books
  }
}
