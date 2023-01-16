#ifndef BOOKSHELFITERATOR_H
#define BOOKSHELFITERATOR_H

#pragma once

#include <memory>
#include <vector>
#include "Book.h"

class BookShelfIterator
{
public:
    BookShelfIterator();
    explicit BookShelfIterator(std::shared_ptr<std::vector<Book>>);
    ~BookShelfIterator();

    bool hasNext() const;
    Book next();

private:
    std::shared_ptr<std::vector<Book>> books;
    int index;
};

#endif