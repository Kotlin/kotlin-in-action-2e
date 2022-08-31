package ch01.ex1_ATasteOfKotlin

data class Person(
    val name: String,
    val age: Int? = null
)

fun main() {
    val persons = listOf(
        Person("Alice", age = 29),
        Person("Bob"),
    )
    val oldest = persons.maxByOrNull {
        it.age ?: 0
    }
    println("The oldest is: $oldest")
}

// The oldest is: Person(name=Alice, age=29)
