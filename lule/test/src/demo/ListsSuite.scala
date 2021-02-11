package demo

import utest._
import scala.collection.Iterable

object ListsSuite extends TestSuite {
  val tests = Tests {

    test("endsWith") - {
      val list = List(korv)
      val r = Lists.endsWith(v, list)

      assert {
        r == List(true)
      }
    }

    test("dropRight") - {
      val list = List(1, 2, 3, 4)
      val r = Lists.dropRight(2, list)

      assert {
        r == List(1, 2)
      }

    }

    test("lägg till element sist i listan") - {
      val list = List(1, 2)
      val r = Lists.addLast(3, list)

      assert {
        r == List(1, 2, 3)
      }
    }

    test("lägg till element först i listan") - {
      val list = List(2, 3)
      val r = Lists.addFirst(1, list)

      assert {

        r == List(1, 2, 3)
      }
    }

    test("hitta unika värden i lista") - {
      val list = List(1, 1, 2, 2, 3, 4, 5)
      val r = Lists.distinct(list)

      assert {
        r == List(1, 2, 3, 4, 5)
      }
    }

    test("Hämta element på index n") - {
      val list = List(1, 2, 3, 4, 5, 6, 7)

      var r = Lists.apply(2, list)

      assert {
        r == 3
      }
    }

    test("reverse list") - {
      val list = List(1, 2, 3)

      val result = Lists.reverse(list)

      assert {
        result == List(3, 2, 1)
      }
    }
    test("list contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(1, list)

      assert {
        result == true
      }
    }

    test("join") - {
      val list1 = List(1, 2)
      val list2 = List(3, 4)

      val result = Lists.join(list1, list2)

      assert {
        result == List(1, 2, 3, 4)
      }
    }
  }
}
