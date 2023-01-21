# Handling CMake Project

#### 1. create directory with a name such as 'output', 'dist'

```shell
mkdir output
```

#### 2. move into the newly created directory

```shell
cd output
```

#### 3. build inside the directory using CMakeLists.txt file in project root

```shell
cmake ..
make
```

#### 4. run executable

```shell
./cppDesignPattern
```

## Instead, you can use "CMake Tools" vscode extension

it provides various options that helps developers minimize the headaches while development process in progress

- CMake: Configure
- CMake: Build
- CMake: Clean
- CMake: Run Without Debugging
- CMake: Debug
