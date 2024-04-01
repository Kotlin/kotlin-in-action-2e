package ch14

import kia2e.coroutines.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.coroutineContext

suspend fun introspect() {
    log(coroutineContext) // <1>
}

fun main() {
    runBlocking {
        introspect()
    }

    runBlocking(Dispatchers.IO + CoroutineName("Coolroutine")) {
        introspect()
    }
}