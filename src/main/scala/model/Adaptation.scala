package model

import model.Song.Song

trait Adaptation(original: Song):
  type Constraint
  extension (a: Adaptation)
    def adaptVerseAt(index: Int)(text: String): Adaptation
    def addConstraintAt(index: Int)(constraint: Constraint): Adaptation
    def getAdaptation: Song


