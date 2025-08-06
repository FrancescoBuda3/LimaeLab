package model

//import hyphenation.Hyphenator.*
opaque type Indexing = (Int, Int)

object Indexing:
  def apply(start: Int, end: Int): Indexing =
    require (start >= 0 && end > start)
    (start, end)

  extension (i: Indexing)
    def start: Int = i._1
    def end: Int = i._2

trait Verse extends Line:
  type Figure
  def rhetoric: Map[Indexing, Figure]

  
object Verse:
  ???

//  private case class VerseImpl(text: String, hyphPoints: Seq[Int])
//  /**
//   * A poetic verse
//   */
//  opaque type Verse = VerseImpl
//
//  def verse(text: String)(using hyphFunc: String => Seq[String]): Verse =
//    VerseImpl(text,
//      """\S+""".r
//        .findAllMatchIn(text)
//        .flatMap(m =>
//          hyphFunc(m.matched)
//            .scanLeft(0)(_ + _.length)
//            .tail
//            .appended(m.matched.length + 1)
//            .map(_ + m.start)
//        )
//        .toSeq
//        .dropRight(1)
//    )
//
//  extension (v: Verse)
//    def text: String = v.text
//    def hyphPoints: Seq[Int] = v.hyphPoints
//    def addHyphenationPoint(hyphPoint: Int): Verse = VerseImpl(v.text, v.hyphPoints.appended(hyphPoint).sorted)
//    def removeHyphenationPoint(hyphPoint: Int): Verse = VerseImpl(v.text, v.hyphPoints.filter(_ != hyphPoint))
      
      

