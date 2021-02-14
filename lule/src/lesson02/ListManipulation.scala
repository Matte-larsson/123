package lesson02

object ListManipulation {
  def isEven(i: Int): Boolean = i % 2 == 0
  def filterEvenNumbers(xs: List[Int]): List[Int] = xs.filter(isEven)
  def filterOddNumbers(xs: List[Int]): List[Int] = xs.filter(i => !isEven(i))
  def filterEvenNumbersContaining2(xs: List[Int]): List[Int] = {
    xs
      .filter(i => i % 2 == 0)
      .filter(i => i.toString.contains("2"))
  }
  def filterEvenNumbersContaining2BiggerThan100(xs: List[Int]): List[Int] = {
    xs
      .filter(i => i % 2 == 0)
      .filter(i => i.toString.contains("2"))
      .filter(i => i > 100)
  }
  def filterEvenNumbersContaining2BiggerThan100SmallerThan200(
    xs: List[Int]
  ): List[Int] = {
    xs
      .filter(i => i % 2 == 0)
      .filter(i => i.toString.contains("2"))
      .filter(i => i > 100)
      .filter(i => i < 200)
    }
  }

