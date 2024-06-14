package chapter04

import kotlin.random.Random
import kotlin.random.nextInt

fun sum(list: List<Int>): Int {
    return if (list.isEmpty()) 0 else {
        list[0] + sum(list.subList(1, list.size))
    }
}

fun main() {
    val list = mutableListOf<Int>()

    for (i in 0..10) {
        list.add(Random.nextInt(0..100))
    }

    val sum = sum(list)

    println("Sum of $list is:\n$sum")
    println("Sum is correct? ${sum == list.sum()}")
}