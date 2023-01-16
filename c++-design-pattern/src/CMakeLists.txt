project(
    c++-design-pattern-src
    VERSION 1.0.0
)

file(GLOB_RECURSE ALL_SOURCE_FILES *.cpp)

add_executable(
    cppDesignPattern
    ${ALL_SOURCE_FILES}
)
