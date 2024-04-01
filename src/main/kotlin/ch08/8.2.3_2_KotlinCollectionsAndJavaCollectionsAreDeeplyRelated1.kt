package ch08.ex2_3_2_KotlinCollectionsAndJavaCollectionsAreDeeplyRelated1

import ch08.CollectionUtils

// Kotlin
// collections.kt
fun printInUppercase(list: List<String>) {
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}
