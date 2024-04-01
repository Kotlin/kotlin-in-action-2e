package ch02.ex4_4_1_UsingInToCheckCollectionAndRangeMembership

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main() {
    println(isLetter('q'))
    println(isNotDigit('x'))
}
