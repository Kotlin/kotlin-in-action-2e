package ch13.ex1_2_LambdasWithReceivers1

fun buildString(
    builderAction: StringBuilder.() -> Unit,
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main() {
    val s = buildString {
        this.append("Hello, ")
        append("World!")
    }
    println(s)
    // Hello, World!
}
