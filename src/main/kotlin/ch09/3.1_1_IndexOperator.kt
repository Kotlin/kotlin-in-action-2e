package ch09.ex1_1_IndexOperator

data class Point(val x: Int, val y: Int)

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val p = Point(10, 20)
    println(p[1])
    // 20
}
