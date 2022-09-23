package ch06.ex1_6_2_TransformingCollectionsIntoMapsAssociateAssociateWithAndAssociateBy1

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Joe", 22),
        Person("Mary", 31),
        Person("Jamie", 22)
    )
    val personToAge = people.associateWith { it.age }
    println(personToAge)
    // {Person(name=Joe, age=22)=22, Person(name=Mary, age=31)=31,
    //  Person(name=Jamie, age=22)=22} <1>
    val ageToPerson = people.associateBy { it.age }
    println(ageToPerson)
    // {22=Person(name=Jamie, age=22), 31=Person(name=Mary, age=31)} <3>
}
