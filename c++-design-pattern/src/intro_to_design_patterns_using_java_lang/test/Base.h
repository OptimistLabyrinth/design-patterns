#ifndef TESTMAIN_BASE_H
#define TESTMAIN_BASE_H

#pragma once

class Base
{
public:
    Base();
    Base(const Base &);
    Base &operator=(const Base &);
    Base(Base &&);
    Base &operator=(Base &&);
    virtual ~Base();

    virtual void run();

private:
};

#endif