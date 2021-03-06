name := "jbrowse-adam"
organization := "md.fusionworks"

version := "0.1"

scalaVersion := "2.10.5"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV = "2.3.9"
  val sprayV = "1.3.3"
  Seq(
    "io.spray" %% "spray-can" % sprayV,
    "io.spray" %% "spray-routing" % sprayV,
    "io.spray" %% "spray-testkit" % sprayV % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.specs2" %% "specs2-core" % "2.3.11" % "test",
    "io.spray" %% "spray-json" % "1.3.2",
    "org.bdgenomics.adam" % "adam-core" % "0.16.0",
    "org.apache.spark" %% "spark-sql" % "1.4.1"
  )
}

Revolver.settings
