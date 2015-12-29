package test.scala.scala99

import main.scala.scala99.Problem1.solution
import org.scalatest.{FlatSpec, Matchers}

class Problem1Test extends FlatSpec with Matchers {
    "A Problem1 Solution" should "be correct for the simple case" in {
      solution(List(1, 2, 3, 4)) should be (4)
    }

    it should "be correct for the advanced case" in {
      solution(List(1)) should be (1)
    }
}
