package model.figures

trait Rhyme extends Figure:
  def endings: Set[String]

object Rhyme:
  
  private case class RhymeImpl(endings: Set[String]) extends Rhyme:
    override def isConnected: Figure => Boolean = 
      case r: Rhyme => r.endings.map(_.toUpperCase).intersect(endings.map(_.toUpperCase)).nonEmpty
    
  def apply(endings: Set[String]): Rhyme = RhymeImpl(endings)  