package ch11.ex3_1_RestrictingTheTypeAGenericClassOrFunctionCanUseTypeParameterConstraints

fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0
}

fun main() {
    println(oneHalf(3))
    // 1.5
}
