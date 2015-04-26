enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaJSStage in Global := FastOptStage

scalaVersion := "2.11.5"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"
