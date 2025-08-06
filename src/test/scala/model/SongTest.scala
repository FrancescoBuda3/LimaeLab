package model

//import model.Song.{Song, song}
//import model.hyphenation.Hyphenator.{Hyphenator, hyphenator}
//import org.scalatest.matchers.should.Matchers.*
//
//class SongTest extends org.scalatest.flatspec.AnyFlatSpec:
//  val itHyph: Hyphenator = hyphenator(Language.English, 2, 3)
//  given hyphFunction: (String => Seq[String]) = itHyph.hypenate
//
//  val testSong: Song = song("Imagine", Seq(
//    "Imagine there's no heaven",
//    "It's easy if you try",
//    "No hell below us",
//    "Above us, only sky",
//    "Imagine all the people",
//    "Living for today"
//  ))
//
//  "A verse" should "be correctly appended" in:
//    val newVerse = Verse.verse("Ah")
//    val expectedSong = song("Imagine", Seq(
//      "Imagine there's no heaven",
//      "It's easy if you try",
//      "No hell below us",
//      "Above us, only sky",
//      "Imagine all the people",
//      "Living for today",
//      "Ah"
//    ))
//    testSong.appendVerse(newVerse) should be (expectedSong)
//
//  "A verse" should "be correctly removed" in:
//    val expectedSong = song("Imagine", Seq(
//      "Imagine there's no heaven",
//      "It's easy if you try",
//      "No hell below us",
//      "Above us, only sky",
//      "Imagine all the people"
//    ))
//    val toBeRemovedVerseIndex = 5
//    testSong.removeVerse(toBeRemovedVerseIndex) should be (expectedSong)
//
//  "A verse" should "be correctly replaced" in:
//    val newVerse = Verse.verse("Ah")
//    val expectedSong = song("Imagine", Seq(
//      "Imagine there's no heaven",
//      "It's easy if you try",
//      "No hell below us",
//      "Above us, only sky",
//      "Ah",
//      "Living for today"
//    ))
//    val toBeReplacedVerseIndex = 4
//    testSong.replaceVerse(toBeReplacedVerseIndex, newVerse) should be (expectedSong)

