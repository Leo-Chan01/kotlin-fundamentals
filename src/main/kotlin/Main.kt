import com.raym.Person
import java.util.TreeMap

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

    for(i in 1..10 step 2){
        println("I is: $i")
    }

    for (i in 10 downTo 10 step 2){
        println("I is now $i")
    }

    var numbers = listOf(112,20,330,54,50)

    for (i in numbers.size -1 downTo 1 ){
        println("This index's value is ${numbers.elementAt(i)}")
    }

    for (i in 1 until numbers.size){
        println(numbers[i])
    }

    for (i in numbers){
        println(i)
    }

    var ages = TreeMap<String, Int>()

    ages["Jason"] = 25
    ages["Janet"] = 33
    ages["Joan"] = 50
    ages["Onyi"] = 21
    ages["Leo"] = 20

    for ((name, age) in ages){
        println("$name is $age")
    }

    for((index, value ) in numbers.withIndex()){
        println("index $index is holding a value of $value")
    }
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