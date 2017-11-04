package oo

class Country(val name: String, val population: Int) {

    fun print() = "$name, $population habs"
}

fun main(args: Array<String>) {

    val australia = Country("Australia", 24_561_509)

    println(australia.name)
    println(australia.population)

    println(australia.print())
}