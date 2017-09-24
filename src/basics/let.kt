package basics

import java.io.File

fun main(args: Array<String>) {

    // Scoping the access of the buffered reader

    // val reader = File("example.txt").bufferedReader()

    try {
        File("example.txt").bufferedReader().let {
            if (it.ready()) {
                println(it.readLine())
            }
        }
    } catch (e: Exception) {
        // This will occur as file does not exist
    }

    // BufferedReader instance should not be visible after this

    // Working with nullables

    val str: String? = "Kotlin for Android"

    // Instead of this

//    if (str!!.isNotEmpty()) {
//        str?.toLowerCase()
//    }

    str?.let {
        // This will be executed only if str not null
        // If it is null, this block will be ignored
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}