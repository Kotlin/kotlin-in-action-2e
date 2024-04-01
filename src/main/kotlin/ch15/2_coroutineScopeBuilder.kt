package ch15

import kia2e.coroutines.log
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun generateValue(): Int {
    delay(500.milliseconds)
    return Random.nextInt(0, 10)
}

suspend fun computeSum() { // <1>
    log("Computing a sum...")
    val sum = coroutineScope { // <2>
        val a = async { generateValue() }
        val b = async { generateValue() }
        a.await() + b.await() // <3>
    }
    log("Sum is $sum")
}

fun main() = runBlocking {
    computeSum()
}