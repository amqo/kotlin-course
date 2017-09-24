package basics

fun main(args: Array<String>) {

    val possiblePrimesAfter2 = generateSequence(3) { it + 2 }

    val primes = generateSequence(2 to possiblePrimesAfter2) {

        // println("Generating sequence for ${ it.second.first() }")

        // Next prime number
        val next = it.second.first()

        // Filter out all elements divisible by this next element
        val possiblePrimesAfterNext = it.second.filter { it % next != 0 }

        // Return the next element in the sequence
        // Same as Pair(next, possiblePrimesAfterNext)
        next to possiblePrimesAfterNext

    }.map { it.first }

    println(primes.take(100).toList())
}

// First iteration (next = 3)
// 3 to possiblePrimesAfter3
// possiblePrimesAfter3 excludes all numbers divisible by 2, as it is a filter of possiblePrimesAfter2
// possiblePrimesAfter3 excludes all numbers divisible by 3

// Second iteration (next = 5)
// 5 to possiblePrimesAfter5
// possiblePrimesAfter5 excludes all previously excluded, as it is a filter of possiblePrimesAfter3

// next will always be the next prime number