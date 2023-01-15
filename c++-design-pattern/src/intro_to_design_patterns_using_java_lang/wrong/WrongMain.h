#ifndef WRONGMAIN_H
#define WRONGMAIN_H

#pragma once

#include "../DesignPatternMain.h"

class WrongMain : public DesignPatternMain
{
public:
    WrongMain();
    ~WrongMain();

    void run() override;

private:
};

#endif