val scala3Version = "3.1.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "99scalaproblems",
    version := "1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
  )
