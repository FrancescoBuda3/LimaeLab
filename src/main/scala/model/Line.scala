package model

trait Line:
  def length: Int
  def content: String

object Line:
  
  private case class LineImpl(s: String) extends Line:
    override def length: Int = s.length
    override def content: String = s
    
  def apply(s: String): Line = LineImpl(s)
  def empty: Line = LineImpl("")