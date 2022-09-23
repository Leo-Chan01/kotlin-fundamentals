@file:JvmName("DisplayFunctions")

package raym

import java.util.regex.Pattern

fun main(args: Array<String>) {
    display("Hello, world")
    //calling a function without a default parameter, if you don't give the param
    //it uses the default on, else...
    log("Hello, world")
    //you will then have to specify it yourself.
    log2("Hello, world", 24)
    //this overwrites the default parameter
    log("Yellow", 5)
    //Named parameter
    log(message = "Hello, world")

    var isAmatch: Boolean

    isAmatch = Pattern.matches("Hello", "Hello")

    println("Is a match is: $isAmatch")

    Regex("isAMatch", RegexOption.CANON_EQ)
}

fun display(message: String): Boolean{
    println(message)
    return true
}
//using default parameters
@JvmOverloads
fun log(message: String, logLevel: Int = 2){
    println(message + logLevel)
}

fun log2(message: String, logLevel: Int){
    println(message + logLevel)
}

fun replaceMultipleSpace(value: String){
    //browse about REGEX
}
