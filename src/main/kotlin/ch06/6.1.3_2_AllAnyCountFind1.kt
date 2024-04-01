package ch06.ex1_3_2_AllAnyCountFind1

fun main() {
    val list = listOf(1, 2, 3)
    println(!list.all { it == 3 })
    println(list.any { it != 3 })
}
