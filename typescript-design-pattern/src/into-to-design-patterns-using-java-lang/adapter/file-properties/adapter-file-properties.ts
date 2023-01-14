import Output from '../../../utils/stdin-stdout/output'
import { FileIO } from './file-io'
import FileProperties from './file-properties'

const setFileProperties = async () => {
  const f: FileIO = new FileProperties()
  const fileName = 'abc.txt'
  f.setValue('width', '1024')
  f.setValue('height', '512')
  f.setValue('depth', '32')
  return f.writeToFile(fileName)
}

const getFileProperties = async () => {
  const f: FileIO = new FileProperties()
  const fileName = 'abc.txt'
  await f.readFromFile(fileName)
  const width = f.getValue('width')
  const height = f.getValue('height')
  const depth = f.getValue('depth')
  Output.dir({ width, height, depth })
}

const adapterFileProperties = async () => {
  await setFileProperties()
  await getFileProperties()
}

export default adapterFileProperties
