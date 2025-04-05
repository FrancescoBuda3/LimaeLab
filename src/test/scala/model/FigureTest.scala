package model

import org.junit.Test
import org.junit.Assert.*

class FigureTest:

    val r = Rhyme("A", List("ide", "why"))
    
    @Test def testCheck: Unit = 
        assertTrue(r.check("ide") && !r.check("ine"))
    
    @Test def testName: Unit =
        assertTrue(r.name == "A")
