#include "TestMain.h"

#include <iostream>
#include <memory>
#include <utility>
#include "Base.h"
#include "AAA.h"
#include "BBB.h"

TestMain::TestMain()
{
}

TestMain::~TestMain()
{
}

void TestMain::run()
{
    std::unique_ptr<Base> aaa = std::make_unique<AAA>();
    aaa->run();
    auto &aaaResult = doSomething(aaa);
    aaaResult->run();
    std::cout << "\n";

    std::unique_ptr<Base> bbb = std::make_unique<BBB>();
    bbb->run();
    auto &bbbResult = doSomething(bbb);
    bbbResult->run();
    std::cout << "\n";
}

const std::unique_ptr<Base> &TestMain::doSomething(const std::unique_ptr<Base> &instance)
{
    std::cout << "inside TestMain doSomething, before instance->run()\n";
    instance->run();
    std::cout << "inside TestMain doSomething, after  instance->run()\n";
    return instance;
}
