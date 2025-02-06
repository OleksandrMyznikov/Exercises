package org.example.exercises

import kotlin.math.max
import kotlin.math.min


fun maxAreaBF(height: IntArray): Int {
    var maxSquare = 0
    for (i in 0 until height.size - 1) {
        for (j in 1 until height.size) {
            val square = min(height[i], height[j]) * (j - i)
            maxSquare = max(maxSquare, square)
        }
    }

    return maxSquare
}

fun maxArea(height: IntArray): Int {
    var startIndex = 0
    var endIndex = height.size - 1
    var maxArea = 0
    while (startIndex != endIndex) {
        val currentArea = min(height[startIndex], height[endIndex]) * (endIndex - startIndex)
        maxArea = max(maxArea, currentArea)
        if (height[startIndex] > height[endIndex]) {
            endIndex--
        }
        else {
            startIndex++
        }
    }

    return maxArea

}

fun main() {
    println(maxArea(intArrayOf(1,8,6,2,5,4,8,3,7)))

}