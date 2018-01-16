package oo

// If only have methods with T as a return value, then you use this "out"
class Source<out T>(val t: T) {

    fun produceT(): T  {
        return t
    }
}

// With this "in" only methods with T as in type parameter are possible, not as a return type
class Sink<in T> {

    fun consumeT(t: T) {
        // ...
    }
}

fun main(args: Array<String>) {

    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource  // covariance
    println(anySource.produceT())

    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // contravariance
    strSink.consumeT("Consumer")

    // Invariance = neither covariant nor contravariant
    // You need to use an exact type, not super or child
}