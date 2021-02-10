package demo

import utest._

object ListsSuite extends TestSuite {
  val tests = Tests {
    test("reverse list") - {
      val list = List(1, 2, 3)

      val result = Lists.reverse(list)

      assert {
        result == List(3, 2, 1)
      }
    }
    test("list contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(2, list)

      assert {
        result == true
      }
    }
    test("list not contains") - {
      val list = List(1, 2, 3)

      val result = Lists.contains(10, list)

      assert {
        result == false
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