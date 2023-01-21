#include "BBB.h"

#include <iostream>

BBB::BBB()
{
    std::cout << "BBB Constructor\n";
}

BBB::BBB(const BBB &other)
{
    std::cout << "BBB Copy Constructor\n";
}

BBB &BBB::operator=(const BBB &other)
{
    std::cout << "BBB Copy Constructor\n";
    return *this;
}

BBB::BBB(BBB &&other) noexcept
{
    std::cout << "BBB Move Constructor\n";
}

BBB &BBB::operator=(BBB &&other) noexcept
{
    std::cout << "BBB Move Constructor\n";
    return *this;
}

BBB::~BBB()
{
    std::cout << "BBB Destructor\n";
}

void BBB::run()
{
    std::cout << "BBB run()\n";
}
