package ch17

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    val names = flow {
        emit("Jo")
        emit("May")
        emit("Sue")
    }
    val uppercasedNames = names.map {
        it.uppercase()
    }
    runBlocking {
        uppercasedNames.collect { print("$it ") }
    }
    // JO MAY SUE
}