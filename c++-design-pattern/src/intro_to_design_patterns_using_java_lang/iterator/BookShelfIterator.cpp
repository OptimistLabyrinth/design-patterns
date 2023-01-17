#include "BookShelfIterator.h"

#include <iostream>
#include <stdexcept>
#include <utility>

BookShelfIterator::BookShelfIterator() : books(std::make_shared<std::vector<Book>>()), index(0)
{
}

BookShelfIterator::BookShelfIterator(std::shared_ptr<std::vector<Book>> books)
    : books(books), index(0)
{
}

BookShelfIterator::~BookShelfIterator()
{
}

bool BookShelfIterator::hasNext() const
{
    return index < books->size();
}

Book BookShelfIterator::next()
{
    if (!hasNext())
    {
        throw std::out_of_range("no such element");
    }
    Book book = books->at(index);
    index++;
    return book;
}
