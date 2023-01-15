#include "Book.h"

Book::Book()
{
}

Book::Book(const char *name) : name(name)
{
}

Book::~Book()
{
}

const std::string &Book::getName()
{
    return name;
}
