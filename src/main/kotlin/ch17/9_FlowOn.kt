package ch17

import kia2e.coroutines.log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        flowOf(1)
            .onEach { log("A") }
            .flowOn(Dispatchers.Default)
            .onEach { log("B") }
            .flowOn(Dispatchers.IO)
            .onEach { log("C") }
            .collect()
    }
}