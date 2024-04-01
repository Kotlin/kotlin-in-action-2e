package ch07.ex1_4_1_ProvidingDefaultValuesInNullcasesWithTheElvisOperator

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main() {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}
