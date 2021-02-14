package lesson02

import utest._

object ListManipulationSuite extends TestSuite {
  val tests = Tests {

            test("filterEvenNumbersContaining2BiggerThan100SmallerThan200") - {
      val minlista = List(100, 101, 102, 122)

      val resultat = ListManipulation.filterEvenNumbersContaining2BiggerThan100SmallerThan200(minlista)

      assert {
        resultat == List(102, 122)
      }
    }

        test("Containing 2 Bigger than 100") - {
      val minlista = List(100, 101, 102, 122)

      val resultat = ListManipulation.filterEvenNumbersContaining2BiggerThan100(minlista)

      assert {
        resultat == List(102, 122)
      }
    }

    test("filterEvenNumbersContaining2") - {
      val minlista = List(1, 2, 34, 22, 7, 222)

      val resultat = ListManipulation.filterEvenNumbersContaining2(minlista)

     assert {
       resultat == List(2, 22, 222)
      }

    }

    test("filter oddNumbers") - {
      val minlista = List(1, 2, 3, 4, 5)

      val resultat = ListManipulation.filterOddNumbers(minlista)

      assert {
        resultat == List(1, 3, 5)

      }
    }
    test("filter evenNumbers") - {
      val minlista = List(1, 2, 3, 4, 5)

      val resultat = ListManipulation.filterEvenNumbers(minlista)

      assert {
        resultat == List(2, 4)
      }
    }
  }
}
