package model

class LineTest extends org.scalatest.flatspec.AnyFlatSpec:

  "A Line" should "have length 0 when created with an empty string" in:
    val line = Line("")
    assert(line.length == 0)

  it should "have length 0 when created empty" in:
    val line = Line.empty
    assert(line.length == 0)

  it should "have the length of the string it is created with" in:
    val line = Line("Hello, World!")
    assert(line.length == 13)
    
  it should "return the content it was created with" in:
    val line = Line("Hello, World!")
    assert(line.content == "Hello, World!")