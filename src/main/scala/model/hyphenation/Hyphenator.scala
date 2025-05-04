package model.hyphenation

import model.Language
import org.apache.fop.hyphenation.HyphenationTree
import org.xml.sax.InputSource

import java.io.InputStream

object Hyphenator:
  
  private case class HyphenatorImpl(tree: HyphenationTree, remainChars: Int, pushChars: Int)
  
  opaque type Hyphenator = HyphenatorImpl
  
  def hyphenator(language: Language, remainChars: Int, pushChars: Int): Hyphenator =
    val patternStream: InputStream = getClass.getResourceAsStream(s"/hyph/${language.code}.xml")
    require(patternStream != null, s"no hyphenation pattern for $language")
    val tree = new HyphenationTree
    tree.loadPatterns(InputSource(patternStream))
    HyphenatorImpl(tree, remainChars, pushChars)

  extension (h: Hyphenator)
    def hypenate(word: String): Seq[String] =
      val pts = h.tree.hyphenate(word, h.remainChars, h.pushChars).getHyphenationPoints
      (0 +: pts :+ word.length)
        .sliding(2)
        .map { case Array(s, e) => word.substring(s, e) }
        .toSeq
        
    