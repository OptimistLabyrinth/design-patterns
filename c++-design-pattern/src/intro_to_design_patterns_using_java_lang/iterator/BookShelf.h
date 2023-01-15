#ifndef BOOKSHELF_H
#define BOOKSHELF_H

#pragma once

#include <memory>
#include <vector>
#include "Book.h"
#include "BookShelfIterator.h"

class BookShelf
{
public:
    BookShelf();
    explicit BookShelf(int);
    ~BookShelf();

    Book getBookAt(int);
    void appendBook(const Book &);
    const int getLength();
    const std::shared_ptr<std::vector<Book>> &getBooks();

    std::shared_ptr<BookShelfIterator> iterator();

private:
    std::shared_ptr<std::vector<Book>> books;
};

#endif