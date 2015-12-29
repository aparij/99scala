//Find the last but one element of a list.
package main.scala.scala99

object Problem2 {
  def solution[T](list: List[T]): T = {
    if (list.isEmpty) throw new NoSuchElementException
    else list.dropRight(1).last
  }
  def solution2[T](list: List[T]): T = {
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last
  }
}
