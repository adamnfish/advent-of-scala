package advent2022

import scala.io.Source

object TestHelpers {
  def loadTestPuzzleInput(day: Int): List[String] = {
    val filename = s"puzzle-test-inputs/day${"%02d".format(day)}.txt"
    Source.fromResource(filename).getLines().toList
  }
}
