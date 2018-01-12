package oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

// This can be used as a Singleton
// The same as class, but no constructor and has only one instance
object CountryFactory {

    // All here will be as static fields and functions
    val factoryType = 0

    fun createCountry() = Country("Australia")
}

object DefaultClickListener: MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse clicked")
    }
}

fun main(args: Array<String>) {

    println(CountryFactory.factoryType)

    val country = CountryFactory.createCountry()
    println(country.name)
}