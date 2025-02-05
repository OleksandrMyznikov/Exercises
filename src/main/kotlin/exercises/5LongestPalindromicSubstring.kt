package org.example.exercises

/***
 * https://leetcode.com/problems/longest-palindromic-substring/description/
 * Given a string s, return the longest
 * palindromic
 *
 * substring
 *  in s.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 *
 *
 *
 *
 *
 */
//abssc
//abss
//abs
//ab
//a
//bssc
//bss
//bs
//b
//c
//babad
fun longestSubstring(s: String): String {
    var result = ""
    for (i in 0 until s.length) {
        for (j in i .. s.length) {

            val substring = s.substring(i, j)
            println("i: $i j: $j substring: $substring")
            if (isPalindrome(substring)) {
                if (substring.length > result.length) {
                    result = substring
                }
            }
        }
    }

    return result
}

fun isPalindrome(n: String): Boolean {
    for (i in 0 until n.length / 2) {
        if (n.get(i) != n.get(n.length - 1 - i)) {
            return false
        }
    }
    return true
}

fun main() {
    println(longestSubstring("babad"))
    println(longestSubstring("cbbd"))
    println(longestSubstring("a"))
}

