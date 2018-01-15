package oo

open class Being
open class Person: Being()
class Student: Person()

fun main(args: Array<String>) {

    // Covariance = we can use a "more derived" type (a subtype)

    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student()) // covariance

    // Not possible as Being is less derived, not more derived
    // people.add(Being())

    // Read-only collections are covariant
    val students: List<Person> = listOf<Student>()

    // Read-Write collections are not covariant
    // val studentsMutable: MutableList<Person> = mutableListOf<Student>()
    // studentsMutable.add(Person())
}