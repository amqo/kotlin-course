package oo

class Country(val name: String, val population: Int) {

    constructor(name: String): this(name, 0) {
        println("Constructor called")
    }

    fun print() = "$name, $population habs"
}

fun main(args: Array<String>) {

    val australia = Country("Australia", 24_561_509)
    println(australia.name)
    println(australia.population)
    println(australia.print())

    val spain = Country("Spain")
    println(spain.name)
    println(spain.population)
    println(spain.print())
}