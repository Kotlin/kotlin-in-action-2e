package ch183

import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.seconds

class ComponentWithScope(dispatcher: CoroutineDispatcher = Dispatchers.Default) {
    private val exceptionHandler = CoroutineExceptionHandler { _, e ->
        println("[ERROR] ${e.message}")
    }


    private val scope = CoroutineScope(SupervisorJob() + dispatcher + exceptionHandler)


    fun action() = scope.async { // <1>
        launch {
            throw UnsupportedOperationException("Ouch!")
        }
    }
}


fun main() = runBlocking {
    val supervisor = ComponentWithScope()
    supervisor.action()
    delay(1.seconds)
}