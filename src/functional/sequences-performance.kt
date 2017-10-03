package functional

import kotlin.system.measureTimeMillis

val veryLongList = (1..9999999L).toList()
val takeNumber = 10 * 1000

fun main(args: Array<String>) {

    println("Allocating memory, wait...")

    measure()

    println()

    measureImprove()
}

private fun measure() {

    var sum = 0L
    var sumLazy = 0L

    // This will take the last 1000 last elements only after the computation finished
    val ms = measureTimeMillis {
        sum = veryLongList
                .filter { it > 50 }
                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .take(takeNumber)
                .sum()
    }

    // This instead will calculate in a lazy way, not for all elements in the list
    val msLazy = measureTimeMillis {
        sumLazy = veryLongList
                .asSequence()
                .filter { it > 50 }
                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .take(takeNumber)
                .sum()
    }

    println("Non-Lazy Result: $sum, $ms ms")
    println("Lazy Result: $sumLazy, $msLazy ms")
}

// Take elements before mapping
private fun measureImprove() {

    var sum = 0L
    var sumLazy = 0L

    // This will take the last 1000 last elemens only after the computation finished
    val ms = measureTimeMillis {
        sum = veryLongList
                .filter { it > 50 }
                .take(takeNumber)
                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .sum()
    }

    // This instead
    val msLazy = measureTimeMillis {
        sumLazy = veryLongList
                .asSequence()
                .filter { it > 50 }
                .take(takeNumber)
                .map { it * 2 }
                .map { it / 3 }
                .map { it + 17 }
                .sum()
    }

    println("[Improve] Non-Lazy Result: $sum, $ms ms")
    println("[Improve] Lazy Result: $sumLazy, $msLazy ms")
}