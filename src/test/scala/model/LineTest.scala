package model

class LineTest extends org.scalatest.flatspec.AnyFlatSpec:
  
  "A Line" should "have length 0 when created with an empty string" in:
    val line = Line("")
    assert(line.length == 0)
    
  