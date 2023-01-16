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

Book BookShelf::getBookAt(int index) const
{
    return books->at(index);
}

void BookShelf::appendBook(const Book &book)
{
    books->push_back(book);
}

int BookShelf::getLength() const
{
    return books->size();
}

const std::shared_ptr<std::vector<Book>> &BookShelf::getBooks() const
{
    return books;
}

std::unique_ptr<BookShelfIterator> BookShelf::iterator()
{
    return std::make_unique<BookShelfIterator>(books);
}
