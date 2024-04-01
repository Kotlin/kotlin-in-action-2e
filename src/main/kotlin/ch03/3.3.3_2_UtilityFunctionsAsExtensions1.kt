package ch03.ex3_3_2_UtilityFunctionsAsExtensions1

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun main() {
    val list = listOf(1, 2, 3)
    println(list.joinToString(" "))
}
