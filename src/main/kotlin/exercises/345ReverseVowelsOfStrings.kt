package org.example.exercises

/**
 * 345. Reverse Vowels of a String
 * Easy
 * Topics
 * Companies
 * Given a string s, reverse only all the vowels in the string and return it.
 *
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "IceCreAm"
 *
 * Output: "AceCreIm"
 *
 * Explanation:
 *
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 *
 * Example 2:
 *
 * Input: s = "leetcode"
 *
 * Output: "leotcede"
 *
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 3 * 105
 * s consist of printable ASCII characters.
 */
fun reverseVowels(s: String): String {
    var chars = s.toCharArray()
    val vowels = mutableSetOf('a', 'e', 'i', 'o','u', 'A', 'E', 'I', 'O','U')
    var leftIndex = 0
    var rightIndex = chars.size - 1
    while (leftIndex != rightIndex) {
        if (vowels.contains(chars.get(leftIndex))) {
            var rightIndexFound = false
            while (!rightIndexFound && leftIndex != rightIndex) {
                if (vowels.contains(chars.get(rightIndex))) {
                    rightIndexFound = true
                } else {
                    rightIndex--
                }
            }
            if (rightIndexFound) {
                swap(chars, leftIndex, rightIndex)
                rightIndex--
            }
        }
        leftIndex++
    }

    return String(chars)
}

fun swap(array: CharArray, leftIndex: Int, rightIndex: Int) {
    val tmp = array[leftIndex]
    array[leftIndex] = array[rightIndex]
    array[rightIndex] = tmp
}

fun main() {
    println(reverseVowels("IceCreAm"))
}