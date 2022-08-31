package geometry.example

import geometry.shapes.Rectangle
import geometry.shapes.createUnitSquare

fun main() {
    println(Rectangle(3, 4).isSquare)
    println(createUnitSquare().isSquare)
}
