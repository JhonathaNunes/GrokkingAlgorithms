package chapter01

import kotlin.random.Random

fun binarySearch(list: Array<Int>, item: Int): Int? {
    var low = 0
    var high = list.size - 1

    while (low <= high) {
        val mid = (low + high).div(2)
        val guess = list[mid]

        if (guess == item) return mid

        if (guess > item) high = mid - 1 else low = mid + 1
    }

    return null
}

fun main() {
    val arr = Array(Random.nextInt(1, 100)) {
        Random.nextInt(0, 100)
    }.sortedArray()

    println(arr.contentToString())

    val search = Random.nextInt(0, 100)
    println("Searching for $search")

    println("$search index is: ${binarySearch(arr, search)}")
}