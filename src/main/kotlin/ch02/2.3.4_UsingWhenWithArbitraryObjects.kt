package ch02.ex3_4_UsingWhenWithArbitraryObjects

import ch02.colors.Color
import ch02.colors.Color.*

fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main() {
    println(mix(BLUE, YELLOW))
}
