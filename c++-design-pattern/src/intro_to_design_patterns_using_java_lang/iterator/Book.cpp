#include "Book.h"

Book::Book() = default;

Book::Book(const char *name) : name{name}
{
}

Book::~Book() = default;

const std::string &Book::getName() const
{
    return name;
}
