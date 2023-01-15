#include "BookShelf.h"

#include <memory>
#include <vector>
#include "Book.h"
#include "BookShelfIterator.h"

BookShelf::BookShelf() : books(std::make_shared<std::vector<Book>>())
{
}

BookShelf::BookShelf(int maxSize) : BookShelf()
{
    books->reserve(maxSize);
}

BookShelf::~BookShelf()
{
}

Book BookShelf::getBookAt(int index)
{
    return books->at(index);
}

void BookShelf::appendBook(const Book &book)
{
    books->push_back(book);
}

const int BookShelf::getLength()
{
    return books->size();
}

const std::shared_ptr<std::vector<Book>> &BookShelf::getBooks()
{
    return books;
}

std::shared_ptr<BookShelfIterator> BookShelf::iterator()
{
    return std::make_shared<BookShelfIterator>(books);
}
