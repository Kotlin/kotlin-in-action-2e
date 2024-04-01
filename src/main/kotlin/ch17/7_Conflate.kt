package ch17

import kia2e.coroutines.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        val temps = getTemperatures()
        temps
            .onEach {
                log("Read $it from sensor")
            }
            .conflate()
            .collect {
                log("Collected $it")
                delay(1.seconds)
            }
    }
}