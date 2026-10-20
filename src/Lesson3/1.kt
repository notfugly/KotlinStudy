package Lesson3

data class Point(val x: Double, val y: Double) {
    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    operator fun plus(other: Point): Point {

    }
}

class Human(val name: String, )

fun main() {
    var p1 = Point(4.4, 5.0)
    var p2 = Point(2.3, 5.2)
    println(p1 == p2)

}