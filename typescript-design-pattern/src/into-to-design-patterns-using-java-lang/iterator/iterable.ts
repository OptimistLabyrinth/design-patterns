import type { Iterator } from './iterator'

export interface Iterable<E> {
  iterator: () => Iterator<E>
}
