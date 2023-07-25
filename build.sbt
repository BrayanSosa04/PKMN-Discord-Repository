import org.apache.logging.log4j.core.config.composite.MergeStrategy

name := "Discord"

version := "0.6"

scalaVersion := "2.13.2"

resolvers += "jcenter-bintray" at "https://jcenter.bintray.com"

libraryDependencies ++= Seq(
  "net.dv8tion" % "JDA" % "5.0.0-alpha.22",
  "com.lihaoyi" %% "requests" % "0.7.1",
  "com.lihaoyi" %% "upickle" % "2.0.0",
  "org.influxdb" % "influxdb-java" % "2.23"
)

cancelable in Global := true
