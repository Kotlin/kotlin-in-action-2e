package ch12.ex1_3_ReflectionAPI2

var counter = 0

fun main() {
    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())
    // 21
}
