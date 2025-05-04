package model

import org.scalatest.matchers.should.Matchers.*

import model.hyphenation.Hyphenator.*

class HyphenatorTest extends org.scalatest.flatspec.AnyFlatSpec:
  "An Italian Hyphenator" should "correctly hyphenate italian words" in:
    val itHyph = hyphenator(Language.Italian, 1, 1)
    itHyph.hypenate("cappuccino") should be ("cap" :: "puc" :: "ci" :: "no" :: Nil)

  "An English Hyphenator" should "correctly hyphenate english words" in:
    val enHyph = hyphenator(Language.English, 2, 3)
    enHyph.hypenate("railroad") should be ("rail" :: "road" :: Nil)

