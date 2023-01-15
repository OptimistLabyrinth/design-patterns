#include "IntroToDesignPatternsUsingJavaLang.h"

#include <algorithm>
#include <cctype>
#include <iostream>
#include <iterator>
#include <memory>
#include "DesignPatternMain.h"
#include "../utils/String.h"

#include "iterator/IteratorMain.h"
#include "wrong/WrongMain.h"

// * public
IntroToDesignPatternsUsingJavaLang::IntroToDesignPatternsUsingJavaLang()
{
}

IntroToDesignPatternsUsingJavaLang::~IntroToDesignPatternsUsingJavaLang()
{
}

void IntroToDesignPatternsUsingJavaLang::run()
{
    std::string question = "Select design pattern\n"
                           "  1. Iterator\n"
                           " => ";
    std::cout << question;
    std::string input;
    std::cin >> input;
    auto inputString = String(input);
    inputString.trim();
    inputString.toLower();
    input = inputString.getValue();

    auto designPatternMain = mainForSelectedOption(input);
    designPatternMain->run();
}

// * private
std::shared_ptr<DesignPatternMain> IntroToDesignPatternsUsingJavaLang::mainForSelectedOption(
    const std::string &input)
{
    if (input == "1" || input == "iterator" || input == "pattern 1")
    {
        return std::make_shared<IteratorMain>();
    }
    else
    {
        return std::make_shared<WrongMain>();
    }
}
