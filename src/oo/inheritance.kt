package oo

// Mininal example

// By default classes in Kotlin are final, so we need to add this "open"
open class Base
class Child: Base()

open class Shape(val name: String) {

    // "open" here allows this method to be overriden in child classes
    open fun area() = 0.0
}

class Circle(name: String, val radius: Double): Shape(name) {

    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {

    val smallCircle = Circle("Small Circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}

