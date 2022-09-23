package ch07.ex1_3_1_CombiningNullchecksAndMethodCallsWithTheSafeCallOperator

fun printAllCaps(str: String?) {
    val allCaps: String? = str?.uppercase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}
