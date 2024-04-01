package ch15.ex2_AssociatingCoroutineScopesWithComponentsCoroutineScope

import kia2e.coroutines.log
import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

class ComponentWithScope(dispatcher: CoroutineDispatcher = Dispatchers.Default) {

    private val scope = CoroutineScope(dispatcher + SupervisorJob())

    fun start() {
        log("Starting!")
        scope.launch {
            while (true) {
                delay(500.milliseconds)
                log("Component working!")
            }
        }
        scope.launch {
            log("Doing a one-off task...")
            delay(500.milliseconds)
            log("Task done!")
        }
    }

    fun stop() {
        log("Stopping!")
        scope.cancel()
    }
}

fun main() {
    val c = ComponentWithScope()
    c.start()
    Thread.sleep(2000)
    c.stop()
}
