package ch17

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

fun main() {
    val names = flow {
        emit("Jo")
        emit("May")
        emit("Sue")
    }
    val upperAndLowercasedNames = names.transform {
        emit(it.uppercase())
        emit(it.lowercase())
    }
    runBlocking {
        upperAndLowercasedNames.collect { print("$it ") }
    }
    // JO jo MAY may SUE sue
}