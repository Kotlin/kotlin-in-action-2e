package ch03.ex3_5_ExtensionProperties

val String.lastChar: Char
    get() = this.get(length - 1)
var StringBuilder.lastChar: Char
    get() = this.get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main() {
    val sb = StringBuilder("Kotlin?")
    println(sb.lastChar)
    sb.lastChar = '!'
    println(sb)
}
