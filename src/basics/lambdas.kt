package basics

fun main(args: Array<String>) {

    // val timesTwo = { x: Int -> x * 2}

    // val add = { x: Int, y: Int -> x + y }

    val list = (1..100).toList()

    println(list.filter({ element -> element % 2 == 0 }))

    // Use it to simplify the expression
    println(list.filter({ it % 2 == 0 }))

    // Use even() declared outside
    println(list.filter({ it.even() }))

    // If fun takes lambda as last arg, no parenthesis needed
    list.filter { it.even() }

    // Pass fun as reference
    println(list.filter(::isEven))
}

fun Int.even() = this % 2 == 0

fun isEven(i: Int) = i % 2 == 0
