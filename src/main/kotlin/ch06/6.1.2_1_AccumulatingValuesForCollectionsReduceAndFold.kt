package ch06.ex1_2_1_AccumulatingValuesForCollectionsReduceAndFold

fun main() {
    val list = listOf(1, 2, 3, 4)
    val summed = list.reduce { acc, element ->
        acc + element
    }
    println(summed)
    // 10
    val multiplied = list.reduce { acc, element ->
        acc * element
    }
    println(multiplied)
    // 24
}
