package model

import org.junit.Test
import org.junit.Assert.*

class FigureTest:

    var rh: Figure = Rhyme("A", List("ide", "why"))
    var re: Figure = Repetition("Railroad Ride")
    
    @Test def testCheckRhyme: Unit = 
        assertTrue(rh.check("ide") && !rh.check("ine"))
    
    @Test def testNameRhyme: Unit =
        assertTrue(rh.name == "A")
    
    @Test def testCheckRepetition: Unit = 
        assertTrue(re.check("Railroad Ride") && !re.check("Railroad"))
    
    @Test def testNameRepetition: Unit =
        assertTrue(re.name == "Railroad Ride")
    
    @Test def testEquality: Unit = 
        assertTrue(rh == Rhyme("A", List("ide", "why")) && !(re == Repetition("Rilroad Ride")))
    
    @Test def testUpdateRhyme: Unit = 
        rh = Rhyme(rh.name, rh.asInstanceOf[Rhyme].endings :+ "my")
        assertTrue(rh.check("my"))
