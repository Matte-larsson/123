package bonus2

import utest._

object MyMathSuite extends TestSuite {
  val tests = Tests {
    test("Multiply") - {
      val x = 3
      val y = 2

      val r = MyMath.multiply(x, y)

      assert {
        r == 6
      }

      test("Plus") - {
        val x = 3
        val y = 2

        val r = MyMath.plus(x, y)

        assert {
          r == 5
        }

      }
    }
  }

}
