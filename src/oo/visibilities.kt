package oo

// public - same as in Java (default)
// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// -- If the project has only one module, then internal and public are equivalent

// Only visible in this file
private val i = 42

open class Bicycle(val brand: String, private val model: String) {

    protected fun tellMeYourModel() = model
}

private class SpecificCycle: Bicycle("", "") {

    fun tellParentsModel() = tellMeYourModel()
}

fun main(args: Array<String>) {

    var cycle = Bicycle("BRAND", "MODEL")
    cycle.brand
    // cycle.model cannot access as it's private
    // cycle.tellParentsModel() cannot access as it's protected

    var specificCycle = SpecificCycle()
    specificCycle.tellParentsModel()

    println(i)
}
