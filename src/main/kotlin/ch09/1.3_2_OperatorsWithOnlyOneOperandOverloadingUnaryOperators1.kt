package ch09.ex3_2_OperatorsWithOnlyOneOperandOverloadingUnaryOperators1

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var bd = BigDecimal.ZERO
    println(bd++)
    // 0
    println(bd)
    // 1
    println(++bd)
    // 2
}
