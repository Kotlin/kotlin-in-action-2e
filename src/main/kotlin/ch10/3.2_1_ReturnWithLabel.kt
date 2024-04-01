package ch10.ReturnWithLabel

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach label@{
        if (it.name != "Alice") return@label
        print("Found Alice!")
    }
}

fun main() {
    lookForAlice(people)
    // Found Alice!
}
