package advent2022.challenges

object Day01 {
  def part1(input: List[String]): String = {
    // not the real answer :-)
    input
      .map(myLogic)
      .count(_.nonEmpty)
      .toString
  }

  // Maybe you want to pull some logic out into its own function!
  // You can then test this piece of logic separately
  // (very handy for tricky parts of the challenges!)
  def myLogic(inputLine: String): String = {
    inputLine.take(2)
  }

  def part2(input: List[String]): String = {
    ???
  }
}
