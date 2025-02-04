package org.example

import org.example.alghoritms.sorting.insertionSort

fun main() {
    val array = arrayOf(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0).toMutableList()
    insertionSort(array)
    println(array)
}