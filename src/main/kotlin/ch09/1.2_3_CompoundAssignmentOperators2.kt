package ch09.ex2_3_CompoundAssignmentOperators2

fun main() {
    val list = mutableListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    // [1, 2, 3]
    println(newList)
    // [1, 2, 3, 4, 5]
}
