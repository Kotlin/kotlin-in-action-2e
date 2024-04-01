package ch16

import kia2e.coroutines.log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.time.Duration.Companion.milliseconds

class RadioStation {
    private val _messageFlow = MutableSharedFlow<Int>() // <1>
    val messageFlow = _messageFlow.asSharedFlow() // <2>

    fun beginBroadcasting(scope: CoroutineScope) {
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                val number = Random.nextInt(0..10)
                log("Emitting $number!")
                _messageFlow.emit(number) // <3>
            }
        }
    }
}

fun main(): Unit = runBlocking {
    val radioStation = RadioStation()
    radioStation.beginBroadcasting(this)
    delay(600.milliseconds)
    radioStation.messageFlow.collect {
        log("A collecting $it!")
    }
}