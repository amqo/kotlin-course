package basics

fun main(args: Array<String>) {


    // Lazy infinite list initialization
    val listSequence = generateSequence(0) {
        println("Calculating sequence element for $it with result ${it + 10}")
        it + 10
    }

    val first10 = listSequence.take(10).toList()
    // Here it will calculate only from element 10, as it calculated those before
    val first20 = listSequence.take(20).toList()

    println(first10)
    println(first20)

    val list = (1..1000).toList()

    val last10 = list.drop(990)
    println(last10)

    val first = listSequence.first()
    val last = list.last()

    println("First $first")
    println("Last $last")
}