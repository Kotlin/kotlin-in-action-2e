package ch08.ex2_5_5_Arrays4

fun main(args: Array<String>) {
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())
}
