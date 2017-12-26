name := "spark_kafka"

version := "1.0"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
 // "io.get-coursier" %% "coursier" % "1.0.0",
  "org.apache.spark" %% "spark-streaming-kafka" % sparkVersion
)

//addSbtPlugin("com.geirsson" % "sbt-scalafmt" % "1.3.0")
        