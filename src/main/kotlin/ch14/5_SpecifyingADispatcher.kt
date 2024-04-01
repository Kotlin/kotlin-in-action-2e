package ch14

import kia2e.coroutines.log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        log("Doing some work")
        launch(Dispatchers.Default) { // <1>
            log("Doing some background work")
        }
    }
}