package ch06.ex1_10_1_MergingCollectionsZip

data class Person(val name: String, val age: Int)

fun main() {
    val names = listOf("Joe", "Mary", "Jamie")
    val ages = listOf(22, 31, 22, 44, 0)
    println(names.zip(ages))
    println(names.zip(ages) { name, age -> Person(name, age) })
}
