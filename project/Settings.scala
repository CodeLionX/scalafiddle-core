/**
  * Application settings. Configure the build for your application here.
  * You normally don't have to touch the actual build definition after this.
  */
object Settings {

  /** Options for the scala compiler */
  val scalacOptions = Seq(
    "-Xlint",
    "-unchecked",
    "-deprecation",
    "-feature"
  )

  /** Declare global dependency versions here to avoid mismatches in multi part dependencies */
  object versions {
    val fiddle        = "1.0.7"
    val scalatest     = "3.0.3"
    val macroParadise = "2.1.0"
    val akka          = "2.5.1"
    val akkaHttp      = "10.0.6"
    val upickle       = "0.4.4"
    val ace           = "1.2.2"
    val dom           = "0.9.2"
    val scalatags     = "0.6.5"
    val async         = "0.9.1"
    val coursier      = "1.0.0-M14"
  }

}