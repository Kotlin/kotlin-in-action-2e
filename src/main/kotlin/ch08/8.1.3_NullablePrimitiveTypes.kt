package ch08.ex1_3_NullablePrimitiveTypes

data class Person(val name: String,
                  val age: Int? = null) {

    fun isOlderThan(other: Person): Boolean? {
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}
