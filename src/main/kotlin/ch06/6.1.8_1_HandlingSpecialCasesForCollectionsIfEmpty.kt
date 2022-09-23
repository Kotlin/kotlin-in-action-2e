package ch06.ex1_8_1_HandlingSpecialCasesForCollectionsIfEmpty

fun main(args: Array<String>) {
    val empty = emptyList<String>()
    val full = listOf("apple", "orange", "banana")
    println(empty.ifEmpty { listOf("no", "values", "here") })
    println(full.ifEmpty { listOf("no", "values", "here") })
}
