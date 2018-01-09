package oo

// Using "data" generates hashCode(), equals(), toString(), copy(), destructuring operator
data class Address(val street: String, val number: Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main street", 42, "1234", "New York")
    val residence2 = Address("Main street", 42, "1234", "New York")

    // toString()
    println(residence)

    // Referencial equality
    println(residence === residence2)
    // Structural equality, equals()
    println(residence == residence2)

    // copy()
    val neighbor = residence.copy(number = 34)
    println(neighbor)

    // Destructuring operator
    residence.component1()
    val(street, number, postcode, city) = residence
    println("$street $number, $postcode $city")
}