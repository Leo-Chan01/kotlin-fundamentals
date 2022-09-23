package raym

fun main(args: Array<String>) {
    println(max(2,3))
}

//function expression
fun max(a: Int, b: Int): Int = if (a > b) a else b