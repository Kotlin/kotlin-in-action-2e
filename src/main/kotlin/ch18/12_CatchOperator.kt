package ch18

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    exceptionalFlow
        .catch { cause ->
            println("\nHandled: $cause")
            emit(-1)
        }
        .collect {
            print("$it ")
        }
}