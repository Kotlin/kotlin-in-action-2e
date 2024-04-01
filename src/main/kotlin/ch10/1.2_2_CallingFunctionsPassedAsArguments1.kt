package ch10.ex2_2_CallingFunctionsPassedAsArguments1

fun twoAndThree(
    operation: (operandA: Int, operandB: Int) -> Int,
) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun main() {
    twoAndThree { operandA, operandB -> operandA + operandB }
    // The result is 5
    twoAndThree { alpha, beta -> alpha + beta }
    // The result is 5
}
