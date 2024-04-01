package ch11.ex1_1_FunctionsAndPropertiesThatWorkWithGenericTypes

fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    // [a, b, c]
    println(letters.slice(10..13))
    // [k, l, m, n]
}
