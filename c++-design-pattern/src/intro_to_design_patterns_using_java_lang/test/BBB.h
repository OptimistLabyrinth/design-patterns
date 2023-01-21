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
    BBB(BBB &&)
    noexcept;
    BBB &operator=(BBB &&) noexcept;
    ~BBB() override;

    void run() override;
};

#endif