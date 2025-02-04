package org.example.alghoritms.sorting
// 0,1,2
//[5,9,2]
fun <E> bubbleSort(list: MutableList<E>) where E: Comparable<E>{
    for (j in 0..<list.size-1) {
        for (i in 0..<list.size - 1) {
            if (list[i] > list[i+1]) {
                swap(list, i, i + 1)
            }
        }
    }
}

fun <E>swap(list: MutableList<E>, firstIndex: Int, secondIndex: Int) {
    val tmp = list[firstIndex]
    list[firstIndex] = list[secondIndex]
    list[secondIndex] = tmp
}