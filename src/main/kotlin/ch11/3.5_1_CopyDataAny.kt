package ch11.CopyDataAny

fun <T : R, R> copyData(
    source: MutableList<T>,
    destination: MutableList<R>,
) {
    for (item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
    // [1, 2, 3]
}
