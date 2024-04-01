package ch06.ex2_1_1_ExecutingSequenceOperations

fun main() {
    listOf(1, 2, 3, 4).asSequence()
     .map {
         print("map($it) ")
         it * it
     }
     .filter {
         print("filter($it) ")
         it % 2 == 0
     }
}
