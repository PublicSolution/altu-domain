import sbt.Keys.resolvers
import sbt._

object Dependencies {

  lazy val akkaVersion = "2.5.6"
  lazy val akkaHttpVersion = "10.0.10"

  resolvers += Resolver.sonatypeRepo("public")
  resolvers += JavaNet2Repository


  // Libraries for Akka
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
  val akkaCluster = "com.typesafe.akka" %% "akka-cluster" % akkaVersion
  val akkaStream = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val akkaHttp = "com.typesafe.akka" %% "akka-http" % akkaHttpVersion

  val akkaPersistence = "com.typesafe.akka" %% "akka-persistence" % akkaVersion

  val akkaDeps = Seq(akkaActor, akkaCluster, akkaStream, akkaHttp, akkaPersistence)

}
