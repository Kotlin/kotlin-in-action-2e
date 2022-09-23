package ch06.ex1_8_2_HandlingSpecialCasesForCollectionsIfEmpty1

fun main(args: Array<String>) {
    val blankName = " "
    val name = "J. Doe"
    println(blankName.ifEmpty { "(unnamed)" })
    println(blankName.ifBlank { "(unnamed)" })
    println(name.ifBlank { "(unnamed)" })
}
