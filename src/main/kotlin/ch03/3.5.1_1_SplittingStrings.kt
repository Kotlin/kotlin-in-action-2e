package ch03.ex5_1_1_SplittingStrings

fun main() {
    println("12.345-6.A".split("\\.|-".toRegex()))
}
