package org.example.exercises

/**
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 * 1456. Maximum Number of Vowels in a Substring of Given Length
 * Medium
 * Topics
 * Companies
 * Hint
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 *
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abciiidef", k = 3
 * Output: 3
 * Explanation: The substring "iii" contains 3 vowel letters.
 * Example 2:
 *
 * Input: s = "aeiou", k = 2
 * Output: 2
 * Explanation: Any substring of length 2 contains 2 vowels.
 * Example 3:
 *
 * Input: s = "leetcode", k = 3
 * Output: 2
 * Explanation: "lee", "eet" and "ode" contain 2 vowels.
 */
fun maxVowels(s: String, k: Int): Int {
    val vowels = mutableSetOf('a', 'e', 'i', 'o', 'u')
    var maxVowels = 0
    for (i in 0..s.length - k) {
        var currentVowels = 0
        for (j in 0..<k) {
            if (vowels.contains(s[i+j])) {
                currentVowels++
            }
        }
        if (maxVowels < currentVowels) {
            maxVowels = currentVowels
        }
    }

    return maxVowels
}

fun main() {
    println(maxVowels("abciiidef", 3))
    println(maxVowels("leetcode", k = 3))
}