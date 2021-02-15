import mill._, scalalib._

val utestVersion = "0.7.5"

object lule extends ScalaModule {
  def scalaVersion = "2.13.4"

  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.7.8"
  )
  object test extends Tests {
    def testFrameworks = Seq("utest.runner.Framework")

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.5",
      ivy"com.lihaoyi::requests::0.6.5"
    )

  }
  def mainClass = Some("webServer.MinimalApplication")
}
