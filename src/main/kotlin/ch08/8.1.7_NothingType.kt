package ch08.ex1_7_NothingType

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main(args: Array<String>) {
    fail("Error occurred")
}
