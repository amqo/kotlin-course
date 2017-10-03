package basics

fun main(args: Array<String>) {

    // Named arguments can switch order
    val together = concat(separator = "; ", texts = listOf("Kotlin", "Java", "Scala"))
    print(together)
}

// Default parameter "separator"
fun concat(texts: List<String>, separator: String = ", ") = texts.joinToString(separator)