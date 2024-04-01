package ch11.ex3_2_RestrictingTheTypeAGenericClassOrFunctionCanUseTypeParameterConstraints1

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun main() {
    println(max("kotlin", "java"))
    // kotlin
}
