package org.example.exercises

/**
 * https://leetcode.com/problems/determine-if-two-strings-are-close
 * 1657. Determine if Two Strings Are Close
 * Medium
 * Topics
 * Companies
 * Hint
 * Two strings are considered close if you can attain one from the other using the following operations:
 *
 * Operation 1: Swap any two existing characters.
 * For example, abcde -> aecdb
 * Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
 * For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
 * You can use the operations on either string as many times as necessary.
 *
 * Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "bca"
 * Output: true
 * Explanation: You can attain word2 from word1 in 2 operations.
 * Apply Operation 1: "abc" -> "acb"
 * Apply Operation 1: "acb" -> "bca"
 * Example 2:
 *
 * Input: word1 = "a", word2 = "aa"
 * Output: false
 * Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
 * Example 3:
 *
 * Input: word1 = "cabbba", word2 = "abbccc"
 * Output: true
 * Explanation: You can attain word2 from word1 in 3 operations.
 * Apply Operation 1: "cabbba" -> "caabbb"
 * Apply Operation 2: "caabbb" -> "baaccc"
 * Apply Operation 2: "baaccc" -> "abbccc"
 *
 *
 *
 */
fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) {
        return false
    }
    var word1Map = convertToMap(word1)
    var word2Map = convertToMap(word2)

    if (word1Map.keys != word2Map.keys) {
        return false
    }

    if (word1Map.values.sorted() != word2Map.values.sorted()) {
        return false
    }

    return true
}

fun convertToMap(word: String) : MutableMap<Char, Int> {
    var wordMap = mutableMapOf<Char, Int>()
    word.toCharArray().forEach {
        if (wordMap.contains(it)) {
            wordMap[it] = wordMap[it]!! + 1
        } else {
            wordMap[it] = 1
        }
    }

    return wordMap
}