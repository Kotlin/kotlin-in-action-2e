package ch09.ex1_4_PlusTimesDivideAndMoreOverloadingBinaryArithmeticOperations3

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
    println('a' * 3)
    // aaa
}
