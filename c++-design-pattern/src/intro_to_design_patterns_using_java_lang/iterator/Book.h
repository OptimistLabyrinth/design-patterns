#ifndef BOOK_H
#define BOOK_H

#pragma once

#include <string>

class Book
{
public:
    Book();
    explicit Book(const char *);
    ~Book();

    const std::string &getName();

private:
    const std::string name;
};

#endif