package ch05.ex1_3_1_SyntaxForLambdaExpressions

fun main() {
    val sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))
}
