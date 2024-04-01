package ch06.ex1_6_1_TransformingCollectionsIntoMapsAssociateAssociateWithAndAssociateBy

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Joe", 22), Person("Mary", 31))
    val nameToAge = people.associate { it.name to it.age }
    println(nameToAge)
    println(nameToAge["Joe"])
}
