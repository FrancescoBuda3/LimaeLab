package model

import hyphenation.Hyphenator.*

import scala.util.matching.Regex
  
object Verse:

  private case class VerseImpl(text: String, hyphPoints: Seq[Int])
  /**
   * A poetic verse
   */
  opaque type Verse = VerseImpl

  def verse(text: String)(using hyphFunc: String => Seq[String]): Verse =
    VerseImpl(text,
      """\S+""".r
        .findAllMatchIn(text)
        .flatMap(m =>
          hyphFunc(m.matched)
            .scanLeft(0)(_ + _.length)
            .tail
            .appended(m.matched.length + 1)
            .map(_ + m.start)
        )
        .toSeq
        .dropRight(1)
    )

  extension (v: Verse)
    def text: String = v.text
    def hyphPoints: Seq[Int] = v.hyphPoints
    def addHyphPoint(hyphPoint: Int): Verse = VerseImpl(v.text, v.hyphPoints.appended(hyphPoint).sorted)
    def removeHyphPoint(hyphPoint: Int): Verse = VerseImpl(v.text, v.hyphPoints.filter(_ != hyphPoint))
      
      

