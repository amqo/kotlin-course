package oo

fun Int.isEven() = (this % 2 == 0)

fun City.isLarge() = population > 1_000_000

fun main(args: Array<String>) {
    println(6.isEven())

    val naturals = listOf(2, 5, 11, 3, 8, 4)
    println(naturals.filter { it.isEven()})

    val austin = City()
    austin.name = "Austin"
    austin.population = 950_000
    println(austin.isLarge())
}