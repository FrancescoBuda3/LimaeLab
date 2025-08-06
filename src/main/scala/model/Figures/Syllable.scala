package model.Figures

trait Syllable extends Figure:
  def index: Int
  override def isConnected: Figure => Boolean

object Syllable:
  
  private case class SyllableImpl(index: Int) extends Syllable:
    override def isConnected: Figure => Boolean = _ => false

  def apply(index: Int): Syllable = SyllableImpl(index)
