enablePlugins(ScalaJSPlugin)

name := "shadit"

scalaVersion := "2.11.6"

libraryDependencies += "io.github.widok" %%% "widok" % "0.2.2"

libraryDependencies += "dk.mzw" %%% "scala-shading" % "0.1-SNAPSHOT"

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

persistLauncher in Compile := true

persistLauncher in Test := false