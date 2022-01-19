package penultimate

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import org.scalatest.{Inside, Inspectors, OptionValues}

class PenUltimateTest extends AnyFlatSpec with should.Matchers with OptionValues with Inside with Inspectors {

  "An empty list" should "not contain a penultimate element" in {
    assert(PenUltimate(List()) == None)

  }

  "A populated list" should "return the second to last element" in {
    assert(PenUltimate(List(1,2,3)) == Some(2))

  }

}

