name := "LimaeLab"

version := "0.1"

scalaVersion := "3.3.5"

libraryDependencies ++= Seq(
    "org.scalafx" %% "scalafx" % "23.0.1-R34",
    "com.github.sbt" % "junit-interface" % "0.13.2" % Test,
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

mainClass := Some("HelloWorld")

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true