package oo

abstract class Vehicle {

    open fun drive() {
        println("Driving vehicle")
    }
    abstract fun honk()
}

class Sedan : Vehicle(), Drivable {
    override val medium = "road"

    override fun drive() {
        // Parametrize the parent from which calling "drive()" is mandatory here, as it's ambiguous
        // To avoid this, a good design would be Vehicle implementing Drivable
        //super<Drivable>.drive()
        super<Vehicle>.drive()
    }

    override fun honk() {
        println("Mööp")
    }
}

fun main(args: Array<String>) {

    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}