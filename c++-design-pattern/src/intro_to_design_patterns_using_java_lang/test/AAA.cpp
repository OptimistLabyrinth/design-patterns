#include "AAA.h"

#include <iostream>

AAA::AAA()
{
    std::cout << "AAA Constructor\n";
}

AAA::AAA(const AAA &other)
{
    std::cout << "AAA Copy Constructor\n";
}

AAA &AAA::operator=(const AAA &other)
{
    std::cout << "AAA Copy Assignment Operator\n";
    return *this;
}

AAA::AAA(AAA &&ref)
{
    std::cout << "AAA Move Constructor\n";
}

AAA &AAA::operator=(AAA &&ref)
{
    std::cout << "AAA Move Assignment Operator\n";
    return *this;
}

AAA::~AAA()
{
    std::cout << "AAA Destructor\n";
}

void AAA::run()
{
    std::cout << "AAA run()\n";
}
