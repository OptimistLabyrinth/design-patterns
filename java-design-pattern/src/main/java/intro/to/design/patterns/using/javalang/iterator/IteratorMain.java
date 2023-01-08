package intro.to.design.patterns.using.javalang.iterator;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        ArrayList<Book> books = bookShelf.getBooks();
        for (Book book : books) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}
