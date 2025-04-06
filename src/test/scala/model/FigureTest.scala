package model

import org.junit.Test
import org.junit.Assert.*

class FigureTest:

    val rh: Figure = Rhyme("A", List("ide", "why"))
    val re: Figure = Repetition("Railroad Ride")
    
    @Test def testCheckRhyme: Unit = 
        assertTrue(rh.check("ide") && !rh.check("ine"))
    
    @Test def testNameRhyme: Unit =
        assertTrue(rh.name == "A")
    
    @Test def testCheckRepetition: Unit = 
        assertTrue(re.check("Railroad Ride") && !re.check("Railroad"))
    
    @Test def testNameRepetition: Unit =
        assertTrue(re.name == "Railroad Ride")
