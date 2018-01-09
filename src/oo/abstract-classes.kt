package oo

abstract class Shape(val name: String) {

    abstract fun area(): Double

    fun parentName() = "Shape"
}

class Circle(name: String, private val radius: Double): Shape(name) {

    override fun area(): Double = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {

    val circle = Circle("Large Circle", 17.0)
    println(circle.name)
    println(circle.area())
    println(circle.parentName())
}