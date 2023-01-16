cmake_minimum_required(VERSION 3.0.0)
project(c++-design-pattern
    VERSION 1.0.0
    DESCRIPTION learning_many_different_design_patterns_in_c++_programming_language
)
set(CMAKE_CXX_STANDARD 20)

file(GLOB_RECURSE ALL_SOURCE_FILES
    src/*.cpp
)

add_executable(cppDesignPattern
    ${ALL_SOURCE_FILES}
)
