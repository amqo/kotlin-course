package oo

import java.sql.Time
import java.util.*

// Here List is a generic class, as you can use it for different List types
var list: List<Int> = listOf(1, 2, 3)

// <E> here is the generic type parameter
// Usually <E> for element, <T> for type and so on
class Timeline<E> {

    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun add(element: E) {
        date2Data.put(Date(), element)
    }

    fun getLatest(): E {
        return date2Data.values.last()
    }
}

fun <E> timelineOf(vararg elements: E): Timeline<E> {
    val result = Timeline<E>()
    for (element in elements) {
        result.add(element)
    }
    return result
}

fun main(args: Array<String>) {

    val timeline: Timeline<Int> = Timeline()
    timeline.add(2)
    println(timeline.getLatest())

    val timelineIntType = timelineOf(1, 2, 3)
    println(timelineIntType.getLatest())
}