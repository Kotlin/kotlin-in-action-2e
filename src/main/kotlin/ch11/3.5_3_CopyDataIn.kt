package ch11.CopyDataIn

fun <T> copyData(
    source: MutableList<T>,
    destination: MutableList<in T>,
) {
    for (item in source) {
        destination.add(item)
    }
}
