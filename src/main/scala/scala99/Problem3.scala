//Find the Kth element of a list.
package main.scala.scala99

import java.util.NoSuchElementException


object Problem3 {

  def solution[T](n:Int, list:List[T]): T = {
    if (list.isEmpty) throw new NoSuchElementException
    if (n > list.length) throw new NoSuchElementException
    list.drop(n).head
  }

  def solutionRecursive[T](n:Int, list:List[T]): T = (n,list) match {
      case (0,h::_) => h
      case (n, x::xs) =>  solutionRecursive(n-1,xs)
      case (_,Nil) => throw new NoSuchElementException
    }
}
