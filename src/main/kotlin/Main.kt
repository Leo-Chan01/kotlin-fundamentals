import com.raym.Person

fun main(args: Array<String>) {
    println("Hello World!")

    val ephraim = Person("Ephraim")

    ephraim.name = "Ephraim"
    println("Name is ${ephraim.name}")

    ephraim.name = "Leo"
    println("Name is: ${ephraim.name}")

    ephraim.display()

    ephraim.displayWithLambda(::printName)
}

fun printName(name: String){
    println(name)
}