package ch09.ex1_3_PlusTimesDivideAndMoreOverloadingBinaryArithmeticOperations2

data class Point(val x: Int, val y: Int)

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

fun main() {
    val p = Point(10, 20)
    println(p * 1.5)
    // Point(x=15, y=30)
}
