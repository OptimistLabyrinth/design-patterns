package intro.to.design.patterns.using.javalang.iterator;

import java.util.ArrayList;

public class BookShelf implements Iterable<Book> {
    private final ArrayList<Book> books;

    public BookShelf(int maxSize) {
        this.books = new ArrayList<>(maxSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
