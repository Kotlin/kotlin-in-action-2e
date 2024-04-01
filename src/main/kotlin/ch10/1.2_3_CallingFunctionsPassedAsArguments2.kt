package ch10.ex2_3_CallingFunctionsPassedAsArguments2

fun String.filter(predicate: (Char) -> Boolean): String {
    return buildString {
        for (char in this@filter) {
            if (predicate(char)) append(char)
        }
    }
}

fun main() {
    println("ab1c".filter { it in 'a'..'z' })
    // abc
}
