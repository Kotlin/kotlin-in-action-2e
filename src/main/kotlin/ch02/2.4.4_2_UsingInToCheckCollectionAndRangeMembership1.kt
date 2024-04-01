package ch02.ex4_4_2_UsingInToCheckCollectionAndRangeMembership1

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main() {
    println(recognize('8'))
}
