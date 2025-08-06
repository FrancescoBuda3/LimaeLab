package model.figures

import org.scalatest.matchers.should.Matchers.shouldBe

class RhymeTest extends org.scalatest.flatspec.AnyFlatSpec:

  "A Rhyme" should "be connected to another Rhyme with a common ending" in:
    val rhyme1 = Rhyme(Set("ide"))
    val rhyme2 = Rhyme(Set("ide", "ame"))
    rhyme1.isConnected(rhyme2) shouldBe true

  "A Rhyme" should "not be connected to another Rhyme without a common ending" in:
    val rhyme1 = Rhyme(Set("ide"))
    val rhyme2 = Rhyme(Set("ame"))
    rhyme1.isConnected(rhyme2) shouldBe false