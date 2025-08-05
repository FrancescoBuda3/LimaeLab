package model

object Line:
  
  trait Line:
    def length: Int
    def content: String

  private case class LineImpl(s: String) extends Line:
    def length: Int = s.length
    def content: String = s
  
  def apply(s: String): Line = LineImpl(s)
  def empty: Line = LineImpl("")