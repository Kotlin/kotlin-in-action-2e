package ch06.ex1_1_1_RemovingAndTransformingElementsFilterAndMap

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
}
