package model

import model.Figures.Syllable
import org.scalatest.matchers.should.Matchers.shouldBe

class SyllableTest extends org.scalatest.flatspec.AnyFlatSpec:

  "A Syllable" should "have the index it was created with" in:
    val syllable = Syllable(1)
    (syllable.index == 1) shouldBe true

  "A Syllable" should "not be connected to any other figure" in:
    val syllable = Syllable(1)
    syllable.isConnected(syllable) shouldBe false
