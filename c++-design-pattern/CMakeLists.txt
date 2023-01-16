cmake_minimum_required(VERSION 3.0.0)
project(c++-design-pattern
    VERSION 1.0.0
    DESCRIPTION learning_many_different_design_patterns_in_c++_programming_language
)
set(CMAKE_CXX_STANDARD 20)

set(UTILS_SOURCE_FILES
    src/utils/String.cpp
)

set(ALL_SOURCE_FILES
    src/intro_to_design_patterns_using_java_lang/iterator/Book.cpp
    src/intro_to_design_patterns_using_java_lang/iterator/BookShelf.cpp
    src/intro_to_design_patterns_using_java_lang/iterator/BookShelfIterator.cpp
    src/intro_to_design_patterns_using_java_lang/iterator/IteratorMain.cpp
    src/intro_to_design_patterns_using_java_lang/wrong/WrongMain.cpp
    src/intro_to_design_patterns_using_java_lang/test/AAA.cpp
    src/intro_to_design_patterns_using_java_lang/test/BBB.cpp
    src/intro_to_design_patterns_using_java_lang/test/Base.cpp
    src/intro_to_design_patterns_using_java_lang/test/TestMain.cpp
    src/intro_to_design_patterns_using_java_lang/DesignPatternMain.cpp
    src/intro_to_design_patterns_using_java_lang/IntroToDesignPatternsUsingJavaLang.cpp
)

add_executable(cppDesignPattern
    ${UTILS_SOURCE_FILES}
    ${ALL_SOURCE_FILES}
    src/main.cpp
)
