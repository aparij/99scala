package test.scala.scala99

import main.scala.scala99.Problem2._
import org.scalatest.{FlatSpec, Matchers}

class Problem2Test extends FlatSpec with Matchers {
  "A Problem2 Solution" should "be correct for the simple case" in {
    solution(List(1, 2, 3, 4)) should be (3)
  }

  it should "be correct for the advanced case" in {
    solution(List(1,2)) should be (1)
  }

  it should "produce NoSuchElementException when passed empty list" in {
    intercept[NoSuchElementException] {
      solution(List())
    }
  }

  "A Problem2 Solution 2" should "be correct for the simple case" in {
    solution2(List(1, 2, 3, 4)) should be (3)
  }



}