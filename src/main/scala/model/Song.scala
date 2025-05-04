package model

import model.Verse.*

object Song:
  
  private case class SongImpl(title: Verse, verses: Seq[Verse])

  /**
   * A song with a title and some verses
   */
  opaque type Song = SongImpl
  
  def song(title: String)(using splitter: String => Seq[Split]): Song = 
    SongImpl(verse(title)(using splitter), Seq.empty)