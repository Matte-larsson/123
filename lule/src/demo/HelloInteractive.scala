import demo.Types.test
import scala.io.StdIn.readLine

object HelloInteractive extends App {

  print("Enter your first name: ")
  val firstName = readLine()

  print("Enter your last name: ")
  val lastName = readLine()

  val a = firstName.equalsIgnoreCase ("Kalle")
  val b = firstName.equalsIgnoreCase ("Kurt")
  val c = firstName.equalsIgnoreCase ("bengt")
  val d = firstName.exists(c => 'n' == c)
  val resultat = if (a)
  (s"Your name is $firstName $lastName and you are king")
  else if (b)
    (s"Your name is $firstName $lastName och du är vacker")
  else if (c)
  (s"Your name is $firstName $lastName och du är inte vacker")
    else if (d)
  (s"Du har n i ditt namn")
     

  else(s"Your name is $firstName $lastName")

  println(resultat)
}