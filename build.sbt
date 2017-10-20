name := "altu-domain"

scalaVersion := "2.12.4"

lazy val commonSetting = Seq(
  organization := "org.psolution.altu",
  version := "0.1.0-SNAPSHOT"
)

//Modules
lazy val root = (project in file("."))
  .settings(
    commonSetting,
    name := "Altu Domain Module",
    publishLocal := (),
  )
  .aggregate(core)

lazy val core = (project in file("core"))
  .settings(
    commonSetting,
    name := "Altu Domain Core",
    publishLocal := (),
  )
        