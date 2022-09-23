package ch06.ex1_10_3_MergingCollectionsZip2

fun main(args: Array<String>) {
    val countries = listOf("DE", "NL", "US")
    println(names zip ages zip countries)
}
