package ch02.ex1_6_2_StringTemplates1

fun main() {
    val name = readln()
    if (name.isNotBlank()) {
        println("Hello, ${name.length}-letter person!")
    }
}
