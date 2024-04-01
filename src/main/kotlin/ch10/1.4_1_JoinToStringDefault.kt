package ch10.JoinToStringDefault

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = { it.toString() },
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(transform(element))
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    // Alpha, Beta
    println(letters.joinToString { it.lowercase() })
    // alpha, beta
    println(
        letters.joinToString(separator = "! ", postfix = "! ",
            transform = { it.uppercase() })
    )
    // ALPHA! BETA!
}
