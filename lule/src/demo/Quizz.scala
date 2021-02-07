package demo
import scala.io.StdIn.readLine

object Quizz {

  def start() = {
    val guess = readLine("Skiter björnen i skogen? Y/N: ")

    if (guess == "Y")
      println("rätt")
    else {
      println("Fel")
    }

  }
}
