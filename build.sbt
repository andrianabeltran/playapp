name := """play2torial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

libraryDependencies += "org.webjars" % "jquery" % "1.11.2"

libraryDependencies += "org.webjars" % "bootstrap" % "2.1.1"