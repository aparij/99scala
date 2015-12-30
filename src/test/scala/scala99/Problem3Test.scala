package scala99

import main.scala.scala99.Problem3._
import org.scalatest.{FlatSpec, Matchers}

class Problem3Test extends FlatSpec with Matchers {
  "A Problem3 Solution" should "be correct for the simple case" in {
    solution(2,List(1, 2, 3, 4)) should be (3)
  }

  it should "be correct for the 0 index" in {
    solution(0,List(3,31)) should be (3)
  }


  it should "be correct for the for 0 index, one element list" in {
    solution(0,List(1)) should be (1)
  }

  it should "produce NoSuchElementException when index is too large" in {
    intercept[NoSuchElementException] {
      solution(3,List(1,2))
    }
  }

  "A Problem3 Recursive Solution" should "be correct for the simple case" in {
    solutionRecursive(2,List(1, 2, 3, 4)) should be (3)
  }

  it should "be correct for the 0 index" in {
    solutionRecursive(0,List(3,31)) should be (3)
  }


  it should "be correct for the for 0 index, one element list" in {
    solutionRecursive(0,List(1)) should be (1)
  }

  it should "produce NoSuchElementException when index is too large" in {
    intercept[NoSuchElementException] {
      solutionRecursive(3,List(1,2))
    }
  }




}