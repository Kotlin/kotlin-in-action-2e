package ch02.ex1_2_DeclaringFunctionsWithParametersAndReturnValues

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun main() {
    println(max(1, 2))
}
