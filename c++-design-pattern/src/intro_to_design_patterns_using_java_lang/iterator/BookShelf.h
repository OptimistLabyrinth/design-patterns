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

    Book getBookAt(int) const;
    void appendBook(const Book &);
    size_t getLength() const;
    const std::shared_ptr<std::vector<Book>> &getBooks() const;

    std::unique_ptr<BookShelfIterator> iterator();

private:
    std::shared_ptr<std::vector<Book>> books = std::make_shared<std::vector<Book>>();
};

#endif