package ch14

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

suspend fun doSomethingSlowly() {
    delay(500.milliseconds) // <1>
    println("I'm done")
}

fun main() = runBlocking {
    doSomethingSlowly()
}