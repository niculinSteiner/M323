lazy val root = (project in file("."))
  .settings(
    name := "Task06",
    scalaVersion := "3.4.1"
  )

libraryDependencies += "org.typelevel" %% "cats-effect" % "3.5.4"
