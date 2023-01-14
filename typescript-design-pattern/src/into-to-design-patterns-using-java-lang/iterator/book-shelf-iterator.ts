import Book from './book'
import BookShelf from './book-shelf'
import { Iterator } from './iterator'

export default class BookShelfIterator implements Iterator<Book> {
  private readonly _bookShelf: BookShelf
  private _index: number

  constructor(bookShelf: BookShelf) {
    this._bookShelf = bookShelf
    this._index = 0
  }

  hasNext(): boolean {
    return this._index < this._bookShelf.length()
  }

  next(): Book {
    if (!this.hasNext()) {
      throw new Error('no such element')
    }
    const book = this._bookShelf.getBookAt(this._index)
    this._index = this._index + 1
    return book
  }
}
