package model

import model.Split.{Space, Syllable}
import model.VerseADT.*

import org . scalatest . matchers . should . Matchers .*

given dummySillabifier: (String => Seq[Split]) = _
  .split(" ")
  .foldLeft(Seq.empty)((r, s) => r.appended(Syllable(s)).appended(Space()))
  .dropRight(1)
  .asInstanceOf[Seq[Split]]

class VerseTest extends org.scalatest.flatspec.AnyFlatSpec:

  "A Verse" should "Be Correcty Syllabified" in:
    val v = verse("Nel mezzo del cammin")
    v.InSyllables should be (
      Syllable("Nel") :: Space() :: Syllable("mezzo") :: Space() :: Syllable("del") :: Space() :: Syllable("cammin") :: Nil
    )



