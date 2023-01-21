#ifndef TESTMAIN_AAA_H
#define TESTMAIN_AAA_H

#pragma once

#include "Base.h"

class AAA : public Base
{
public:
    AAA();
    AAA(const AAA &);
    AAA &operator=(const AAA &);
    AAA(AAA &&)
    noexcept;
    AAA &operator=(AAA &&) noexcept;
    ~AAA();

    void run();
};

#endif