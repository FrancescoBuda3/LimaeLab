package model

/**
  * rapresentation of a generic textual figure
  * @param check function that checks if a string is an instance of the figure
  * @param name name of the figure
  */
trait Figure:
    def check: (String) => Boolean
    def name: String

class Rhyme(private val _name: String, private val endings: collection.immutable.Seq[String]) extends Figure:
    override def name = _name
    override def check = e => endings
        .map(f => f.toUpperCase())
        .contains(e.toUpperCase())