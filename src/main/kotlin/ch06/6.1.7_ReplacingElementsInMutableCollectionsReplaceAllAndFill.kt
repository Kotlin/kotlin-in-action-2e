package ch06.ex1_7_ReplacingElementsInMutableCollectionsReplaceAllAndFill

fun main() {
    val names = mutableListOf("Martin", "Samuel")
    println(names)
    names.replaceAll { it.uppercase() }
    println(names)
    names.fill("(redacted)")
    println(names)
}
