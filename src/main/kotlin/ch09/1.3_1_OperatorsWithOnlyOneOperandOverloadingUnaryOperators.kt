package ch09.ex3_1_OperatorsWithOnlyOneOperandOverloadingUnaryOperators

data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

fun main() {
    val p = Point(10, 20)
    println(-p)
    // Point(x=-10, y=-20)
}
