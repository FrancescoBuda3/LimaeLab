package model

object Line:
  opaque type Line = String
  
  def apply(s: String): Line = s
  
  extension (l: Line)
    def length: Int = l.length
    def content: String = l


  def empty: Line = ""