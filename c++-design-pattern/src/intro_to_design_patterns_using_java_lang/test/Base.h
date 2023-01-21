#ifndef TESTMAIN_BASE_H
#define TESTMAIN_BASE_H

#pragma once

class Base
{
public:
    Base();
    Base(const Base &);
    Base &operator=(const Base &);
    Base(Base &&) noexcept;
    Base &operator=(Base &&) noexcept;
    virtual ~Base();

    virtual void run();
};

#endif