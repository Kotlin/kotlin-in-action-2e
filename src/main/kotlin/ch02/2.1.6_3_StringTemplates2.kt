package ch02.ex1_6_3_StringTemplates2

fun main() {
    val name = readln()
    println("Hello, ${if (name.isBlank()) "someone" else name}!")
}
