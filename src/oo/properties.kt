package oo

class City {

    var population: Int = 0
    var name: String = ""
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }

//    default implementation for the getter and setter
//        get() = field
//        set(value) {
//            field = value
//        }
}

fun main(args: Array<String>) {

    var berlin = City()

    // Getters and Setters and created implicitly here
    berlin.name = "Berlin"
    berlin.name = " "
    berlin.population = 3_500_000

    println(berlin.name)
    println(berlin.population)
}