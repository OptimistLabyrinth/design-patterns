#ifndef TESTMAIN_BBB_H
#define TESTMAIN_BBB_H

#pragma once

#include "Base.h"

class BBB : public Base
{
public:
    BBB();
    BBB(const BBB &);
    BBB &operator=(const BBB &);
    BBB(BBB &&);
    BBB &operator=(BBB &&);
    ~BBB();

    void run();

private:
};

#endif