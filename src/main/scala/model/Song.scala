package model

import model.Verse.*

//object Song:
//  
//  private case class SongImpl(title: Verse, verses: Seq[Verse])
//
//  /**
//   * A song with a title and some verses
//   */
//  opaque type Song = SongImpl
//  
//  def song(title: String, verses: Seq[String])(using hyphFunc: String => Seq[String]): Song =
//    SongImpl(verse(title), verses.map(verse(_)))
//    
//  extension (s: Song)
//    def title: Verse = s.title
//    def verses: Seq[Verse] = s.verses
//    def appendVerse(verse: Verse): Song = SongImpl(s.title, s.verses :+ verse)
//    def removeVerse(index: Int): Song = SongImpl(s.title, s.verses.take(index) ++ s.verses.drop(index + 1))
//    def replaceVerse(index: Int, verse: Verse): Song = SongImpl(s.title, s.verses.updated(index, verse))
//    def replaceTitle(title: Verse): Song = SongImpl(title, s.verses)
  