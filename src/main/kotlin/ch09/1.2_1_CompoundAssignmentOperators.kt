package ch09.ex2_1_CompoundAssignmentOperators

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

fun main() {
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
    // Point(x=4, y=6)
}
