package ch11.ex1_2_LimitationsToFindingTypeInformationOfAGenericClassAtRunTimeTypeChecksAndCasts1

fun printSum(c: Collection<Int>) {
    when (c) {
        is List<Int> -> println("List sum: ${c.sum()}")
        is Set<Int> -> println("Set sum: ${c.sum()}")
    }
}

fun main() {
    printSum(listOf(1, 2, 3))
    // List sum: 6
    printSum(setOf(3, 4, 5))
    // Set sum: 12
}
