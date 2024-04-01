package ch11.CopyDataOut

fun <T> copyData(
    source: MutableList<out T>,
    destination: MutableList<T>,
) {
    for (item in source) {
        destination.add(item)
    }
}
