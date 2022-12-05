ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "advent2022"
ThisBuild / organizationName := "advent2022"

lazy val root = (project in file("."))
  .settings(
    name := "advent-of-scala",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test
  )
