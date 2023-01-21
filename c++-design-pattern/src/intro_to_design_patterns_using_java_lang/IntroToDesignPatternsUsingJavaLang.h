#ifndef INTROTODESIGNPATTERNSUSINGJAVALANG_H
#define INTROTODESIGNPATTERNSUSINGJAVALANG_H

#pragma once

#include <memory>
#include <string>
#include "../utils/String.h"
#include "DesignPatternMain.h"

class IntroToDesignPatternsUsingJavaLang
{
public:
    IntroToDesignPatternsUsingJavaLang();
    ~IntroToDesignPatternsUsingJavaLang();

    void run() const;

private:
    std::unique_ptr<DesignPatternMain> mainForSelectedOption(const String &) const;
};

#endif