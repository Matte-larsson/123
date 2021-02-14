package bonus3

object FizzBuzz {

  def fizzBuzz(i: Int): String = {
    if (i % 3 == 0 && i % 5 == 0)
      "FizzBuzz"
    else if (i % 5 == 0)
      "Buzz"
    else if (i % 3 == 0)
      "Fizz"
    else i.toString
  }

}
