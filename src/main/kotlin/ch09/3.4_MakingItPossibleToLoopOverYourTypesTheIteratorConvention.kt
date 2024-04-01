package ch09.ex4_MakingItPossibleToLoopOverYourTypesTheIteratorConvention

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext() =
            current <= endInclusive

        override fun next(): LocalDate {
            val thisDate = current
            current = current.plusDays(1)
            return thisDate
        }
    }

fun main() {
    val newYear = LocalDate.ofYearDay(2042, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }
    // 2041-12-31
    // 2042-01-01
}
