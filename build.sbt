
//Needs be separated by an extra new line

name := "Scala Training"

scalaVersion := "2.11.6"

version := "1.0"

//libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.11"

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.3.11",
                            "org.scalatra" % "scalatra_2.11" % "2.3.1")
