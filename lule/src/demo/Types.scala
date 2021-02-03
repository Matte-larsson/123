package demo

object Types {
    var a: String = "hej"
    val b = "hejdå"
    val i = 42
    val pi: Double = 3.1415

    val iIs42 = 42 == i

    def test() = {
        a = "hello"
        println("Tjena" + a)
        println(b)

        println(i + i)

        println(i + pi)

        if (iIs42)
        println("iIs42 är true")
        else
        println("iIs42 är false")
    }
}