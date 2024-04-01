package ch05.ex4_3_PerformingAdditionalActionsWithAnObjectAlso

fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    val uppercaseFruits = mutableListOf<String>()
    val reversedLongFruits = fruits
        .map { it.uppercase() }
        .also { uppercaseFruits.addAll(it) }
        .filter { it.length > 5 }
        .also { println(it) }
        .reversed()
    println(uppercaseFruits)
    println(reversedLongFruits)
}
