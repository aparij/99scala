//Reverse a list
package main.scala.scala99

object Problem5 {
  def solution[T](list:List[T]): List[T] = {
    list.reverse
  }

  def solutionRecursive[T](list: List[T]): List[T] = list match {
    case (Nil) => Nil
    case (h ::xs ) => solutionRecursive(xs) ++ List(h) // or :+ h or ::: List(h)
  }

}
