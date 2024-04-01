package ch06.ex1_1_4_RemovingAndTransformingElementsFilterAndMap3

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.map { it.name })
}
