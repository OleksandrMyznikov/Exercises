package org.example

//https://www.youtube.com/watch?v=XKu_SEDAykw&ab_channel=LifeatGoogle
//We have an array of

fun hasPairWithSum(array: Array<Int>, sum: Int): Boolean {
    val set = HashSet<Int>()

    array.forEach { item ->
        val otherItem = sum - item

        if (set.contains(otherItem)) {
            return true
        }

        set.add(item)
    }

    return false
}
