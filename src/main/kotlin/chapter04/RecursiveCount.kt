package chapter04

import kotlin.random.Random

fun count(list: List<Int>): Int {
    return if (list.isEmpty()) return 0 else {
        1 + count(list.subList(1, list.size))
    }
}

fun main() {
    val list = mutableListOf<Int>()

    for (i in 0..Random.nextInt(1,100)) {
        list.add(i)
    }

    val count = count(list)

    println("Recursive count is: $count")
    println("Recursive count is correct? ${list.size == count}")
}