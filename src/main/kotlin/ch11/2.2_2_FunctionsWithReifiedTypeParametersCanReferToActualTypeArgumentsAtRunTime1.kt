package ch11.ex2_2_FunctionsWithReifiedTypeParametersCanReferToActualTypeArgumentsAtRunTime1

fun main() {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
    // [one, three]
}
