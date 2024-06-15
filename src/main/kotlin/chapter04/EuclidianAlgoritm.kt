package chapter04

import kotlin.random.Random

fun gdc(n1: Int, n2: Int): Int {
    if (n1 == 0) return n2
    if (n2 == 0) return n1

    val r = n1 % n2

    return gdc(n2, r)
}

fun main() {
    println("Type an integer")
    val n1 = Random.nextInt(0, 1000)
    val n2 = Random.nextInt(0, 1000)

    println("GDC of $n1 and $n2 is: ${gdc(n1, n2)}")
}