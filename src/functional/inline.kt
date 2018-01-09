package functional

fun main(args: Array<String>) {

    val str = "Kotlin is amazing"

    modifyStringSimple(str)

    modifyString(str, { it.toUpperCase() })
    modifyString(str, { it.toLowerCase() })
}

fun modifyStringSimple(str: String): String {
    return str.toUpperCase()
}
// The use of inline here avoids the creation of an anonymous object to replace the lambda (performance overhead at runtime)
// Using noinline can exclude some lambdas from the inline, but here we have only one
inline fun modifyString(str: String, /*noinline*/ operation: (String) -> String): String {
    return operation(str)
}