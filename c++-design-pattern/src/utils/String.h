#ifndef UTILS_STRING_H
#define UTILS_STRING_H

#pragma once

#include <string>

class String
{
public:
    String();
    String(const std::string &);
    ~String();

    std::string &trim(const char *trimTarget = " ");
    std::string &toLower();
    const std::string &getValue();

private:
    std::string value;
};

#endif