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

    std::string &trim(const char *trimTarget = " \t\n\r\f\v");
    std::string &toLower();
    const std::string &getValue() const;

    bool operator==(const char *) const;

private:
    std::string value;
};

#endif