#include "IntroToDesignPatternsUsingJavaLang.h"

#include <algorithm>
#include <cctype>
#include <iostream>
#include <iterator>

#include "iterator/IteratorMain.h"
#include "test/TestMain.h"
#include "wrong/WrongMain.h"

IntroToDesignPatternsUsingJavaLang::IntroToDesignPatternsUsingJavaLang() = default;

IntroToDesignPatternsUsingJavaLang::~IntroToDesignPatternsUsingJavaLang() = default;

void IntroToDesignPatternsUsingJavaLang::run() const
{
    std::string question = {"Select design pattern\n"
                            "  1. Iterator\n"
                            " ....test\n"
                            " => "};
    std::cout << question;
    std::string input;
    std::getline(std::cin, input);
    auto inputString = String{input};
    inputString.trim();
    inputString.toLower();

    auto designPatternMain = mainForSelectedOption(inputString);
    designPatternMain->run();
}

std::unique_ptr<DesignPatternMain> IntroToDesignPatternsUsingJavaLang::mainForSelectedOption(
    const String &input) const
{
    if (input == "1" || input == "iterator" || input == "pattern 1")
    {
        return std::make_unique<IteratorMain>();
    }
    if (input == "test" || input == "else")
    {
        return std::make_unique<TestMain>();
    }
    return std::make_unique<WrongMain>();
}
