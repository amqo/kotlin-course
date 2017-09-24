package basics

import java.io.IOException

fun main(args: Array<String>) {
    val input = try {
        getExternalInput()
    } catch (e: IOException) {
        e.message
    } finally {
        println("Finished")
    }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read input")
}