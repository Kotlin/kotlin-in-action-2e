package ch10.ex2_2_ReturningFromLambdas1

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name != "Alice") return@forEach
        print("Found Alice!")
    }
}
