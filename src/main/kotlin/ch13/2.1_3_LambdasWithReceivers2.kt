package ch13.ex1_3_LambdasWithReceivers2

val appendExcl: StringBuilder.() -> Unit =
    { this.append("!") }

fun main() {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    // Hi!
    println(buildString(appendExcl))
    // !
}
