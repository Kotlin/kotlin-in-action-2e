package ch06.ex1_1_5_RemovingAndTransformingElementsFilterAndMap4

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)
    val filtered = numbers.filterIndexed { index, element ->
        index % 2 == 0 && element > 3
    }
    println(filtered)
    // [5, 7]

    val mapped = numbers.mapIndexed { index, element ->
        index + element
    }
    println(mapped)
}
// [5, 7]
// [1, 3, 5, 7, 9, 11, 13]
