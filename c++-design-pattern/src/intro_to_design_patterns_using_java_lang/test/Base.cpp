#include "Base.h"

#include <iostream>

Base::Base()
{
    std::cout << "Base Constructor\n";
}

Base::Base(const Base &other)
{
    std::cout << "Base Copy Constructor\n";
}

Base &Base::operator=(const Base &other)
{
    std::cout << "Base Copy Assignment Operator\n";
    return *this;
}

Base::Base(Base &&ref) noexcept
{
    std::cout << "Base Move Constructor\n";
}

Base &Base::operator=(Base &&ref) noexcept
{
    std::cout << "Base Move Assignment Operator\n";
    return *this;
}

Base::~Base()
{
    std::cout << "Base Destructor\n";
}

void Base::run()
{
    std::cout << "Base run()\n";
}
