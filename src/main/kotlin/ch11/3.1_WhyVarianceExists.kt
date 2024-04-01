package ch11.ex1_WhyVarianceExists

fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun main() {
    printContents(listOf("abc", "bac"))
    // abc, bac
}
