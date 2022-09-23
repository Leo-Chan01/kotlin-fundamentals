package raym.classes

open class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
}

class Student: Person() {
    override fun getName(): String {return ""}
}

/*
classes are public and final by default.
 Final prevents inheritance of the class and overriding of the method
 to do that (inheritance or overriding), make it open.
* */

