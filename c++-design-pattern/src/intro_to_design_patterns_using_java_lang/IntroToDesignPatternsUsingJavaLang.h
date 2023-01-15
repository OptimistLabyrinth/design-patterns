#ifndef INTROTODESIGNPATTERNSUSINGJAVALANG_H
#define INTROTODESIGNPATTERNSUSINGJAVALANG_H

#pragma once

#include <memory>
#include <string>
#include "DesignPatternMain.h"

class IntroToDesignPatternsUsingJavaLang
{
public:
    IntroToDesignPatternsUsingJavaLang();
    ~IntroToDesignPatternsUsingJavaLang();

    void run();

private:
    std::shared_ptr<DesignPatternMain> mainForSelectedOption(const std::string &);
};

#endif