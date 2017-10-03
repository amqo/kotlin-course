package functional

fun main(args: Array<String>) {

    val list = listOf("Hi", "there" ,"Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    // zipped: List<Pair<String, Boolean>>
    val zipped = list.zip(containsT)
    val zippedMapping = list.zip(list.map { it.contains("t") })

    println(zipped)
    println(zippedMapping)

    val filtered = zipped.filter { it.second }.map { it.first }
    val filteredSimple = list.filter { it.contains("t") }

    println(filtered)
    println(filteredSimple)
}