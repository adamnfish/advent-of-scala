package advent2022.challenges

import advent2022.TestHelpers.loadTestPuzzleInput
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers


class Day01Test extends AnyFreeSpec with Matchers {
  // tests are can be grouped into blocks using the - operator, with a description
  // test blocks follow their description and the in operator
  // assertions are done using scalatest's rich matching functionality:
  //   https://www.scalatest.org/user_guide/using_matchers
  // e.g. shouldEqual

  "part 1" - {
    "solution gives the correct answer for the test input" in {
      val testInput = loadTestPuzzleInput(1)
      val result = Day01.part1(testInput)
      result shouldEqual "2"
    }

    "my logic function" - {
      "correctly truncates the input line" in {
        Day01.myLogic("123456") shouldEqual "12"
      }

      "does nothing for an empty line" in {
        Day01.myLogic("") shouldEqual ""
      }
    }
  }

  "part 2" - {
    "solution gives the correct answer for the test input" in {
      val testInput = loadTestPuzzleInput(1)
      val result = Day01.part2(testInput)
      result shouldEqual "20"
    }
  }
}
