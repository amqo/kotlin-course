package oo

interface Drivable {

    val medium: String
    fun drive() {
        // Default implementation
        println("Driving something $medium")
    }
}

class Car: Drivable {

    override val medium = "road"
    override fun drive() {
        println("Driving car $medium")
    }

    fun accelerate() {
        println("Accelerating car")
    }
}

class Boat: Drivable {

    override val medium = "water"
    override fun drive() {
        println("Driving boat $medium")
    }
}

class Something: Drivable {

    override val medium = "some"
}

fun main(args: Array<String>) {

    val car = Car()
    car.drive()
    car.accelerate()

    // When only need to access the interface methods
    val boat:Drivable = Boat()
    boat.drive()

    val something:Drivable = Something()
    something.drive()
}