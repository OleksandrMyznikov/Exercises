package org.example.alghoritms.sorting

fun <E> insertionSort(mutableList: MutableList<E>) where E : Comparable<E> {
    for (i in 1 until mutableList.size) {
        val insertionElement = mutableList[i]
        println("insertElement: $insertionElement")

        //Search for insertion index
        var insertionIndex = -1
        var j = i - 1
        while (j > 0 && insertionIndex == -1) {
            if (insertionElement < mutableList[j]) {
                insertionIndex = j
            }
            j--
        }

        //Shift from insertion index to the insertion item
        if (insertionIndex != -1) {
            for (k in i - 1 downTo insertionIndex) {
                println("       moving ${mutableList[k]} from: $k to ${k - 1}")
                mutableList[k+1] = mutableList[k]
            }

            mutableList[insertionIndex] = insertionElement
        }


    }
}