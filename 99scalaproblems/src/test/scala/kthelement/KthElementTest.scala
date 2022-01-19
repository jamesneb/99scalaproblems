package kthelement

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import org.scalatest.{Inside, Inspectors, OptionValues}

class KthElementTest  extends AnyFlatSpec with should.Matchers with OptionValues with Inside with Inspectors {

  "Selecting the kth element from an empty list" should "should return None" in {
    assert(kthElement(List(), 1) == None)
  }

  "Selecting the third element from a list of three elements" should "return the third element" in {
    assert(kthElement(List(1,2,3), 2) == Some(3))
  }

  "Selecting the first element from a list of one elements" should "return the first element" in {
    assert(kthElement(List(2), 0) == Some(2))
  }

  "Selecting n + 1 elements from a list of n elements" should "return None" in {
    assert(kthElement(List(1, 2), 3) == None)
  }
}
