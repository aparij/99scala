package scala99

import main.scala.scala99.Problem5._
import org.scalatest.{FlatSpec, Matchers}

class Problem5Test extends FlatSpec with Matchers {
  "A Problem5 Solution" should "be correct for the simple case" in {
    solution(List(1, 2, 3, 4)).toSeq should equal (List(4, 3, 2, 1).toSeq)
  }

  it should "be correct for the empty list" in {
    solution(List()) should be (List())
  }

  it should "be correct for the one element list" in {
    solution(List(1)) should be (List(1))
  }


  "A Problem5 Recursive Solution" should "be correct for the simple case" in {
    solutionRecursive(List(1, 2, 3, 4)).toSeq should equal (List(4, 3, 2, 1).toSeq)
  }

  it should "be correct for the empty list" in {
    solutionRecursive(List()) should be (List())
  }

  it should "be correct for the one element list" in {
    solutionRecursive(List(1)) should be (List(1))
  }



}