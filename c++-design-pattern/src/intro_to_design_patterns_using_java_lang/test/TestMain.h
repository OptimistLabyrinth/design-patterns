#ifndef TESTMAIN_H
#define TESTMAIN_H

#pragma once

#include <memory>
#include "Base.h"
#include "../DesignPatternMain.h"

class TestMain : public DesignPatternMain
{
public:
    TestMain();
    ~TestMain();

    void run();

private:
    const std::unique_ptr<Base> &doSomething(const std::unique_ptr<Base> &);
};

#endif