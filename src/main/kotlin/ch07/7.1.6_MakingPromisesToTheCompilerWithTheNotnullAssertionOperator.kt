package ch07.ex1_6_MakingPromisesToTheCompilerWithTheNotnullAssertionOperator

fun ignoreNulls(str: String?) {
    val strNotNull: String = str!!
    println(strNotNull.length)
}

fun main() {
    ignoreNulls(null)
}
