Advent of Scala (2022)
======================

A helper template for solving advent of code (2022) using Scala.

## Solving the challenges

Create a function that accepts the challenge input as a `List[String]` and returns solves the solution as a String.
Add your puzzle input to the project's resources directory, include this solution in the `AdventOfCode` object's main method.

You can then run the advent of code program, providing the correct day and part.

Open the sbt shell:

    $ sbt

Generate your solution for day 1, part 1.

    > run 1 1

### Detailed step-by-step example

This will walk through the exact steps for solving an advent of code challenge.

#### Create the day's file

Create a new object for the day (if it does not already exist) under the [challenges](src/main/scala/advent2022/challenges) directory, e.g. `Day02`.

#### Add a method for the part you are solving

Create a function in your day's file called whatever you want, but `part1` / `part2` probably makes sense.
This function should take the input as a `List[String]`

The [Day01](src/main/scala/advent2022/challenges/Day01.scala) file is already set up this way.

#### Include your puzzle input

Get your puzzle input from Advent of Code and include it as a file in the [puzzle-inputs](src/main/resources/puzzle-inputs) resources directory called `dayNN.txt`, where `NN` corresponds to the day number (e.g. `day01.txt`, `day14.txt`).

#### Add your solution to the advent of code program

Add a case statement to the [match in the main method](src/main/scala/advent2022/AdventOfCode.scala), so that the day and part you are solving can be executed.

There are already examples for day 1 (parts 1 and 2) to show you one way to do this.

#### Implement your solution

Add your implementation of the challenge part you are solving.

Details about writing tests are included below.

#### Run your solution

Open the sbt shell:

    $ sbt

Generate your solution for day 1, part 2 (or the day and part of your choice).

    > run 1 2

### Layout

You can lay this out however you want, but there's a stubbed suggestion for day 1.

This is the `src` directory, where all your code will go.

```
src
├── main
│   ├── resources
│   │   └── puzzle-inputs
│   │       └── day01.txt
│   └── scala
│       └── advent2022
│           ├── AdventOfCode.scala
│           └── challenges
│               └── Day01.scala
└── test
    ├── resources
    │   └── puzzle-test-inputs
    │       └── day01.txt
    └── scala
        └── advent2022
            ├── TestHelpers.scala
            └── challenges
                └── Day01Test.scala
```

This layout puts the puzzle inputs into the resources directory so that they kept with our code and easy to load from our program.
The code itself is in the scala directory, laid out with a package for the solutions (`challenges`) that contains an Object for each day (e.g. `Day01`).

The Advent of Code object handles the CLI program, and will load your puzzle input and run your solution.

You can include tests for you solutions in the test source tree. A helper for loading test resource inputs is included in [TestHelpers](src/test/scala/advent2022/TestHelpers.scala).

If you want to include any other library dependencies the [build.sbt](build.sbt) file includes a `libraryDependencies` configuration, which you can add to as needed.

## Testing your solution

Since your puzzle solutions are functions that take the puzzle input as an argument, you can test them by providing different inputs.

You can pass input directly from your test source code and/or you can include the challenge's example input in the test resources directory.

An example test is included for day 1 part 1.

To run the project's tests, you can use sbt's test command.

Type `sbt` from the root of the project to enter the sbt shell.

    $ sbt

Then you can run the tests:

    > test

Or run a specific test suite:

    > testOnly advent2022.Day01Test

**Note:** other testing styles exist!

This example uses FreeSpec, which allows you to group tests arbitrarily into blocks to share setup etc.

The following link is an overview of the different testing styles supported by Scalatest. Choose the one you like best!
https://www.scalatest.org/at_a_glance/FreeSpec
