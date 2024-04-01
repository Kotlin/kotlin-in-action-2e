package ch14

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlin.time.Duration.Companion.seconds

fun main() {
    runBlocking {
        launch(Dispatchers.Default) { // <1>
            var x = 0
            repeat(10_000) {
                x++
            }
            println(x)
        }
    }
}

// 10,000

fun main2() {
    runBlocking {
        var x = 0
        repeat(10_000) {
            launch(Dispatchers.Default) { // <1>
                x++
            }
        }
        delay(1.seconds)
        println(x)
    }
}
// 9,916

fun main3() = runBlocking {
    val mutex = Mutex()
    var x = 0
    repeat(10_000) {
        launch(Dispatchers.Default) {
            mutex.withLock {
                x++
            }
        }
    }
    delay(1.seconds)
    println(x)
}
// 10000