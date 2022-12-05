package advent2022

import advent2022.challenges.Day01
import scala.io.Source

object AdventOfCode {
  def main(args: Array[String]): Unit = {
    val result =
      args.toList match {
        case "1" :: "1" :: Nil =>
          Day01.part1(loadPuzzleInput(1))
        case "1" :: "2" :: Nil =>
          Day01.part2(loadPuzzleInput(1))

        // ADD OTHER DAYS AND PARTS HERE AS NEEDED

        case _ =>
          println("Provide a valid day and part to run the program e.g. `run 1 2`")
      }
    println(s"Answer = $result")
  }

  /**
   * Loads the puzzle input for the given day, assuming a consistent format.
   */
  def loadPuzzleInput(day: Int): List[String] = {
    val filename = s"puzzle-inputs/day${"%02d".format(day)}.txt"
    Source.fromResource(filename).getLines().toList
  }
}
