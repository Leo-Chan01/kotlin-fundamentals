package raym

import java.math.BigInteger


//fibonacci Number using recursion
//Big Integer used for integers that can get huge
fun main() {
    //1,1,2,3,5,8,13
    println(fib(n=20, a = BigInteger("1"), b = BigInteger("0")))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    return if (n == 0) b else fib(n-1, a+b, a)
}