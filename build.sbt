name := "LimaeLab"

version := "0.1"

scalaVersion := "3.3.5"

libraryDependencies ++= Seq(
    "org.scalafx" %% "scalafx" % "24.0.0-R35"
)
libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.19"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19" % "test"
libraryDependencies += "org.apache.xmlgraphics" % "fop" % "2.10"
libraryDependencies += "net.sf.offo" % "fop-hyph" % "2.0"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")

mainClass := Some("HelloWorld")

// Fork a new JVM for 'run' and 'test:run', to avoid JavaFX double initialization problems
fork := true