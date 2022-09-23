package ch08.ex2_5_1_Arrays

fun main(args: Array<String>) {
    for (i in args.indices) {
         println("Argument $i is: ${args[i]}")
    }
}
