package chapter04

import kotlin.random.Random

fun max(list: List<Int>): Int {
    if (list.size == 2) {
        return if (list[0] > list[1]) list[0] else list [1]
    }

    val subMax = max(list.subList(1, list.size))
    return if (subMax > list[0]) subMax else list[0]
}

fun main() {
    val list = mutableListOf<Int>()

    for (i in 0..10) {
        list.add(Random.nextInt())
    }

    val max = max(list)

    println("Recursive max is: $max")
    println("Recursive max is correct?\n${list.max() == max}")
}