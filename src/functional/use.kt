package functional

import java.io.FileReader

fun main(args: Array<String>) {

    // This use is used with classes implementing the Closeable interface
    // The close() call will be done automatically

    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
    }
}