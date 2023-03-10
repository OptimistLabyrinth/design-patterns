#include "IteratorMain.h"

#include <iostream>
#include "Book.h"
#include "BookShelf.h"

IteratorMain::IteratorMain() = default;

IteratorMain::~IteratorMain() = default;

void IteratorMain::run()
{
    int maxSize{4};
    auto bookShelf = BookShelf{maxSize};
    bookShelf.appendBook(Book{"Around the World in 80 days"});
    bookShelf.appendBook(Book{"Bible"});
    bookShelf.appendBook(Book{"Cinderella"});
    bookShelf.appendBook(Book{"Daddy-Long-Legs"});

    auto it = bookShelf.iterator();
    while (it->hasNext())
    {
        Book book = it->next();
        std::cout << book.getName() << "\n";
    }
    std::cout << "\n";

    for (const auto &books = *(bookShelf.getBooks()); const auto &book : books)
    {
        std::cout << book.getName() << "\n";
    }
    std::cout << "\n";
}
