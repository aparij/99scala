//Find the number of elements of a list.
package main.scala.scala99



object Problem4 {
  def solution[T](list:List[T]): Int = {
    list.length
  }

  def solutionRecursive[T](list: List[T]):Int = list match {
    case (Nil) => 0
    case (x ::xs) => 1 + solutionRecursive(xs)
  }

}
