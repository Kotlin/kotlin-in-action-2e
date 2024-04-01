package ch15

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.seconds

suspend fun doWork() {
    delay(500.milliseconds) // <1>
    throw UnsupportedOperationException("Didn't work!")
}

fun main() {
    runBlocking {
        withTimeoutOrNull(2.seconds) {
            while (true) {
                try {
                    doWork()
                } catch (e: Exception) { // <2>
                    println("Oops: ${e.message}")
                }
            }
        }
    }
}