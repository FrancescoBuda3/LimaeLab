package model

/**
  * rapresentation of a generic textual figure
  * @param check function that checks if a string is an instance of the figure
  * @param name name of the figure
  */
trait Figure:
    def check: (String) => Boolean
    def name: String

case class Rhyme(private val _name: String, private val _endings: collection.immutable.Seq[String]) extends Figure:
    override def name = _name
    override def check = e => _endings.map(f => f.toUpperCase()).contains(e.toUpperCase())
    def endings = _endings
    
case class Repetition(private val rep: String) extends Figure:
    override def name = rep
    override def check = e => e.toUpperCase() == rep.toUpperCase()