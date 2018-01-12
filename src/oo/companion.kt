package oo

class House(val numberOfRooms: Int, val price: Double) {

    /* Executing with errors with current kotlin plugin version when using this interface */
//    interface HouseFactory {
//        fun createHouse(): House
//    }

    // All inside here will be equivalent to static fields and functions
    // Only one companion for class allowed
//    companion object {
//        val HOUSES_FOR_SALE = 10
//        fun getNormalHouse() = House(6, 199_999.0)
//        fun getLuxuryHouse() = House(42, 7_000_000.0)
//    }

    // Name of the companion is optional
    // By default it will be "Companion", if not used
//    companion object Factory: HouseFactory {
    companion object Factory {

        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
//        override fun createHouse() = getNormalHouse()

    }
}

fun main(args: Array<String>) {

    println(House.HOUSES_FOR_SALE)

    // Name of the companion "Factory" here is optional
    val luxHouse = House.Factory.getLuxuryHouse()
    println(luxHouse.price)

//    val house = House.createHouse()
//    println(house.numberOfRooms)
}