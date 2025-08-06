package model

class VerseTest extends org.scalatest.flatspec.AnyFlatSpec: 
  ???
//  val itHyph: Hyphenator = hyphenator(Language.Italian, 1, 1)
//  given hyphFunction: (String => Seq[String]) = itHyph.hypenate
//
//  "A verse" should "be correctly hyphenated" in:
//    val verse = Verse.verse("nel mezzo del cammin di nostra vita")
//    val expectedHyphenation: Seq[Int] = Seq(3, 4, 7, 9, 10, 13, 14, 17, 20, 21, 23, 24, 26, 30, 31, 33, 35)
//    verse.hyphPoints should be (expectedHyphenation)
//
//  "An Hyphenation point" should "be added" in:
//    val verse = Verse.verse("all'alba sorgerò")
//    val expectedHypenation = Seq(6, 8, 9, 12, 14, 16) // all'al-ba-sor-ge-rò
//    verse.hyphPoints should be (expectedHypenation)
//    val hyphenatedVerse = verse.addHyphenationPoint(2)
//    val expectedHyphenation2: Seq[Int] = Seq(2, 6, 8, 9, 12, 14, 16) // al-l'al-ba-sor-ge-rò
//    hyphenatedVerse.hyphPoints should be (expectedHyphenation2)
//
//  "An Hyphenation point" should "be removed" in:
//    val verse = Verse.verse("si accende washington heights")
//    val expectedHypenation = Seq(2, 3, 5, 8, 10, 11, 13, 18, 21, 22, 29) // si ac-cen-de wa-shing-ton heights
//    verse.hyphPoints should be (expectedHypenation)
//    val hyphenatedVerse = verse.removeHyphenationPoint(2).removeHyphenationPoint(3)
//    val expectedHyphenation2: Seq[Int] = Seq(5, 8, 10, 11, 13, 18, 21, 22, 29) // (si ac)-cen-de wa-shing-ton heights
//    hyphenatedVerse.hyphPoints should be (expectedHyphenation2)







