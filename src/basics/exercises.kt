package basics

fun main(args: Array<String>) {

    exercise1()
    exercise2()
}

fun exercise1() {
    val defaultName = "default"

    print("Welcome! Please type your name to start: ")
    val name: String = readLine() ?: defaultName

    if (name.equals(defaultName) || name.isEmpty()) {
        println("You did not type anything!")
    } else {
        println("Thank you for typing your name")
    }
}

fun exercise2() {
    val randomNumbers = mutableListOf<Int>()
    for (i in 1..100) {
        randomNumbers.add((Math.random() * 100).toInt())
    }
    var i = 0
    while (randomNumbers[i] > 10 && i < randomNumbers.size) {
        val value = randomNumbers[i++]
        print("$value ")
    }
}