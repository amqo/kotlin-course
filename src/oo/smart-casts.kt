package oo

fun Car.replaceWheel() {
    println("Replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}

fun main(args: Array<String>) {

    val vehicle: Drivable = Car()

    vehicle.drive()

    // instanceof <-> is
    if (vehicle is Car) {
        // Smart cast to Car is made here
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        // Smart cast to Boat is made here
        vehicle.startEngine()
    }

    // Also works this way
    if (vehicle is Boat && vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        // ...
    }

    if (vehicle !is Car) {
        return
    }
    vehicle.replaceWheel()
}