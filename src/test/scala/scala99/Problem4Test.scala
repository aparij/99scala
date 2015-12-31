package main.scala.scala99

import main.scala.scala99.Problem4._
import org.scalatest.{FlatSpec, Matchers}

class Problem4Test extends FlatSpec with Matchers {
  "A Problem4 Solution" should "be correct for the simple case" in {
    solution(List(1, 2, 3, 4)) should be (4)
  }

  it should "be correct for the empty list" in {
    solution(List()) should be (0)
  }

  "A Problem4 Recursive Solution" should "be correct for the simple case" in {
    solutionRecursive(List(1, 2, 3, 4)) should be (4)
  }

  it should "be correct for the 0 index" in {
    solutionRecursive(List()) should be (0)
  }


}