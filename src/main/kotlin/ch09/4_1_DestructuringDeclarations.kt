package ch09.exkt

data class Point(val x: Int, val y: Int)

fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    // 10
    println(y)
    // 20
}
