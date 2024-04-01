package ch14

import kotlin.concurrent.thread

fun main() {
    println("I'm on ${Thread.currentThread().name}")
    thread { // <1>
        println("And I'm on ${Thread.currentThread().name}")
    }
}

// I'm on main
// And I'm on Thread-0