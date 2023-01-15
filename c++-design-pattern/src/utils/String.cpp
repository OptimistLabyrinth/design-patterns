#include "String.h"

#include <algorithm>
#include <cctype>

String::String()
{
}

String::String(const std::string &value) : value(value)
{
}

String::~String()
{
}

std::string &String::trim(const char *trimTarget /* = " " */)
{
    value.erase(0, value.find_first_not_of(trimTarget));
    value.erase(value.find_first_not_of(trimTarget) + 1);
    return value;
}

std::string &String::toLower()
{
    std::transform(std::begin(value), std::end(value), std::begin(value),
                   [](unsigned char c)
                   { return std::tolower(c); });
    return value;
}

const std::string &String::getValue()
{
    return value;
}
