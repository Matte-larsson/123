package demo
import scala.io.StdIn.readLine
import scala.util.Random

object Dice {

  def game() = {
    val rnd = new Random
    val guess = readLine("gissa vad det blir av två tärningar").toInt
    val dice1 = rnd.between(1, 7)
    val dice2 = rnd.between(1, 7)
    val summa = dice1 + dice2
    println("")

    if (summa == guess)
      println("Rätt svar")
    else {
      val diff = Math.abs(guess - summa)
      println("Diff fel $diff ")
    }

  }
}
