package lastelements

import org.scalatest.{Inside, Inspectors, OptionValues}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import lastelements.lastElement

class LastElementTest extends AnyFlatSpec with should.Matchers with OptionValues with Inside with Inspectors {
  "An empty list" should "have no last element" in {
    assert(lastElement(List())==None)


  }
  "A populated list" should "return the last element" in {
    assert(lastElement(List(1, 2, 3))==Some(3))
  }
}
