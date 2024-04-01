package ch05.ex1_3_2_SyntaxForLambdaExpressions3

fun main() {
    val sum = { x: Int, y: Int ->
       println("Computing the sum of $x and $y...")
       x + y
    }
    println(sum(1, 2))
}
