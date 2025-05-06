package model

import hyphenation.Hyphenator.*
import model.Language.Italian
import model.Verse.verse
  
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

//@main def main(): Unit = {
//  import java.io.InputStream
//  import org.apache.fop.hyphenation.{HyphenationTree, Hyphenation}
//  import org.xml.sax.InputSource
//  // 1. Carica il pattern di sillabazione per l'italiano
//  val lang = "it"
//  val country = "" // vuoto se non necessario
//  val patterStream: InputStream =
//    getClass.getResourceAsStream(s"/hyph/$lang${
//      if (country.nonEmpty) "_" + country else ""
//    }.xml")
//
//  require(patterStream != null, s"Pattern di sillabazione non trovato per $lang")
//
//  // 2. Costruisci l'albero di sillabazione
//  val tree = new HyphenationTree
//  tree.loadPatterns(InputSource(patterStream))
//
//  // 3. Sillaba la parola
//  val word = "nel mezzo del cammin di nostra vita"
//  // remainChars: minimo di caratteri all'inizio; pushChars: minimo alla fine
//  val remainChars = 1
//  val pushChars = 1
//  val hyph: Hyphenation = tree.hyphenate(word, remainChars, pushChars)
//
//  // 4. Stampa il risultato
//  if (hyph != null) {
//    println(s"Punti di sillabazione per '$word': ${hyph.toString}")
//  } else {
//    println(s"Nessun punto di sillabazione trovato per '$word'")
//  }
//}