package ch11.ex1_2_FunctionsAndPropertiesThatWorkWithGenericTypes1

val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    println(listOf(1, 2, 3, 4).penultimate)
    // 3
}
