export interface FileIO {
  readFromFile: (fileName: string) => void
  writeToFile: (fileName: string) => void
  setValue: (key: string, value: string) => void
  getValue: (key: string) => string
}
