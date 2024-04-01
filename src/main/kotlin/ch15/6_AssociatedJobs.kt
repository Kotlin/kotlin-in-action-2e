package ch15

import kia2e.coroutines.log
import kotlinx.coroutines.CoroutineName
import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking(CoroutineName("A")) {
    log("A's job: ${coroutineContext.job}")
    launch(CoroutineName("B")) {
        log("B's job: ${coroutineContext.job}")
        log("B's parent: ${coroutineContext.job.parent}")
    }
    log("A's children: ${coroutineContext.job.children.toList()}")
}