#include "WrongMain.h"

#include <iostream>

WrongMain::WrongMain() = default;

WrongMain::~WrongMain() = default;

void WrongMain::run()
{
    std::cerr << "You selected wrong option\n";
}
