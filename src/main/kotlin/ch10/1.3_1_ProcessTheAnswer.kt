@file:JvmName("ProcessTheAnswer")

package ch10.ProcessTheAnswer

/* Kotlin declaration */
fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}
