package ch07.ex1_11_1_2_PlatformTypes1

import ch07.Person

fun yellAtSafe(person: Person) {
    println((person.name ?: "Anyone").uppercase() + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person(null))
}
