package ch14

import kia2e.coroutines.log
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

suspend fun slowlyAddNumbers(a: Int, b: Int): Int {
    log("Waiting a bit before calculating $a + $b")
    delay(100.milliseconds * a)
    return a + b
}


fun main() = runBlocking {
    log("Starting the async computation")
    val myFirstDeferred = async { slowlyAddNumbers(2, 2) } // <1>
    val mySecondDeferred = async { slowlyAddNumbers(4, 4) } // <1>
    log("Waiting for the deferred value to be available")
    log("The first result: ${myFirstDeferred.await()}") // <2>
    log("The second result: ${mySecondDeferred.await()}")// <2>
}