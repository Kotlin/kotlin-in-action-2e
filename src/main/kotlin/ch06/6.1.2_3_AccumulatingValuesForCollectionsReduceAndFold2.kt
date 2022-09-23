package ch06.ex1_2_3_AccumulatingValuesForCollectionsReduceAndFold2

data class Person(val name: String, val age: Int)

fun main() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.runningReduce { acc, element ->
        acc + element
    }
    println(summed)
    // [1, 3, 6, 10]  <1>
    val multiplied = list.runningReduce { acc, element ->
        acc * element
    }
    println(multiplied)
    // [1, 2, 6, 24] <1>
    val people = listOf(
        Person("Aleksei", 29),
        Person("Natalia", 28)
    )
    println(people.runningFold("") { acc, person ->
        acc + person.name
    })
    // [, Aleksei, AlekseiNatalia] <1>
}
