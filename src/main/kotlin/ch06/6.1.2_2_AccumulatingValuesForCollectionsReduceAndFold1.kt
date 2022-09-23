package ch06.ex1_2_2_AccumulatingValuesForCollectionsReduceAndFold1

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Aleksei", 29),
        Person("Natalia", 28)
    )
    val folded = people.fold("") { acc, person ->
        acc + person.name
    }
    println(folded)
}
// AlekseiNatalia
