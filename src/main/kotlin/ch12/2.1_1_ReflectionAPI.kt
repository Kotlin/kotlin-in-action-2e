package ch12.ex1_1_ReflectionAPI

import kotlin.reflect.full.memberProperties

class Person(val name: String, val age: Int)

fun main() {
    val person = Person("Alice", 29)
    val kClass = person::class
    println(kClass.simpleName)
    // Person
    kClass.memberProperties.forEach { println(it.name) }
    // age
    // name
}
