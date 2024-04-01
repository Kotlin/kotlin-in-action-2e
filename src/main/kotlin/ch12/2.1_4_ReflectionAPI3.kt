package ch12.ex1_4_ReflectionAPI3

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 29)
    val memberProperty = Person::age
    println(memberProperty.get(person))
    // 29
}
