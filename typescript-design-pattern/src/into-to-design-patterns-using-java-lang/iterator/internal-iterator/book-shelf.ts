import Book from './book'

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

  [Symbol.iterator](): Iterator<Book> {
    let index = 0
    const books = this._books

    const getBook = (): Book => {
      return this.getBookAt(index)
    }

    return {
      next() {
        const value = getBook()
        index = index + 1
        const done = index === books.length
        return { value, done }
      },
    }
  }
}
