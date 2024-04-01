package ch11.printFirst

fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}

fun main() {
    printFirst(listOf("Sveta", "Seb", "Dima", "Roman"))
    // Sveta
}
