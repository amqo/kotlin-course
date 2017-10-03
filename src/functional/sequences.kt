package functional

fun main(args: Array<String>) {

    println("Allocating memory, wait...")

    val veryLongList = (1..99999999L).toList()

    val sum = veryLongList
            .take(1000)
            .filter { it > 50 }
            .map { it * 2 }
            .sum()

    println(sum)

    // This one is better than the previous to calculate the result
    // but does not avoid the time spent allocating memory
    val sumLazy = veryLongList
            .asSequence()
            .take(1000)
            .filter { it > 50 }
            .map { it * 2 }
            .sum()

    println(sumLazy)

    // This one avoids the time spent by the previous two allocating memory for the veryLongList
    val sumSeq = generateSequence(1, { it + 1 })
            .take(1000)
            .filter { it > 50 }
            .map { it * 2 }
            .sum()

    println(sumSeq)
}