package chapter04

import kotlin.random.Random

fun quickSort(list: List<Int>): List<Int> {
    return if (list.size < 2) list else {
        val pivot = list[Random.nextInt(0, list.size)]
        val lower = list.filter { it < pivot }
        val greater = list.filter { it > pivot }

        return quickSort(lower) + pivot + quickSort(greater)
    }
}

fun main() {
    val list = mutableListOf<Int>()

    for (i in 0..10) {
        list.add(Random.nextInt())
    }

    println("Original: $list")
    println("Sorted: ${quickSort(list)}")
}