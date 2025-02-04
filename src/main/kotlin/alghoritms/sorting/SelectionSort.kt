package org.example.alghoritms.sorting

// 0,1,2,3,4,5
//[8,5,2,0,3,7]
fun <E> selectionSort(mutableList: MutableList<E>) where E : Comparable<E> {
    for (j in 0..mutableList.size) {
        var smallestItemIndex = j
        for (i in j..<mutableList.size) {
            if (mutableList[smallestItemIndex] > mutableList[i]) {
                smallestItemIndex = i
            }
        }
        if (smallestItemIndex != j) {
            swap(mutableList, j, smallestItemIndex)
        }
    }




}



