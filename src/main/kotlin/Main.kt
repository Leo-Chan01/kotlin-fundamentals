import com.raym.Person

fun main(args: Array<String>) {
    println("Hello World!")

    /*simple*/
    /*
    val ephraim = Person("Ephraim")
    ephraim.name = "Ephraim"
    println("Name is ${ephraim.name}")
    ephraim.name = "Leo"
    println("Name is: ${ephraim.name}")
    ephraim.display()
    ephraim.displayWithLambda(::printName)
    */

    val q = Question()
    q.answer = "42"
    q.display()
    println("The answer is: ${q.answer}")

    var message = if (q.answer == q.correctAnswer){
        "You are correct"
    }else{
        "Try again"
    }
    println(message)
}

/*simple*/
/*
fun printName(name: String){
    println(name)
}
*/

class Question{
    var answer: String? = null
    val question: String = "What is the answer to life, the universe and everything"
    val correctAnswer = "42"

    fun display(){
        println("You said $answer")
    }
}