package ch02.ex4_3_2_IteratingOverMaps1

fun main() {
    val list = listOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}
