name := "hello-akka"

version := "1.0"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.2",
  "com.typesafe.akka" %% "akka-testkit" % "2.3.2",
  "org.scalatest" %% "scalatest" % "2.1.4" % "test"
)
