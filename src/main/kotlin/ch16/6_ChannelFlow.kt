package ch16

import kia2e.coroutines.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

suspend fun getRandomNumber(): Int {
    delay(500.milliseconds)
    return Random.nextInt()
}

val randomNumbers = channelFlow { // <1>
    repeat(10) {
        launch {
            send(getRandomNumber()) // <2>
        }
    }
}

fun main() = runBlocking {
    randomNumbers.collect {
        log(it)
    }
}