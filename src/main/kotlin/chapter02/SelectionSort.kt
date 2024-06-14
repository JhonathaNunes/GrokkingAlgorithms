package chapter02

import kotlin.random.Random

fun findSmallest(list: List<Int>): Int {
    var smallest = list[0]
    var smallestI = 0

    for (i in 1 until list.size) {
        if (list[i] < smallest) {
            smallest = list[i]
            smallestI = i
        }
    }

    return smallestI
}

fun selectionSort(arr: Array<Int>): List<Int> {
    val result:MutableList<Int> = mutableListOf()
    val arrList:MutableList<Int> = arr.toMutableList()

    for (i in 0 until arrList.size) {
        val smallest = findSmallest(arrList)
        result.add(arrList.removeAt(smallest))
    }

    return result
}

fun main() {
    val arr: Array<Int> = Array(10) {
        Random.nextInt(0, 1000)
    }

    println(arr.contentToString())
    println(selectionSort(arr))
}