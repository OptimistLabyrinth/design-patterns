cmake_minimum_required(VERSION 3.0.0)
project(c++-design-pattern
  VERSION 1.0.0
  DESCRIPTION learning_many_different_design_patterns_in_c++_programming_language
)
set(CMAKE_CXX_STANDARD 20)

add_executable(cppDesignPattern src/main.cpp)

set_target_properties(cppDesignPattern PROPERTIES
  CMAKE_SOURCE_DIR src
  ARCHIVE_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib
  LIBRARY_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/lib
  RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin
)
