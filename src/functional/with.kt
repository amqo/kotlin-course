package functional

fun main(args: Array<String>) {

    val props = System.getProperties()

    with(props) {
        // Instead of props.list, "with" allows this direct use of the function
        // The same with propertyNames, getProperty...
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }
}