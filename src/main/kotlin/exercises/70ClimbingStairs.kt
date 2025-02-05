package org.example.exercises


/**
 * https://leetcode.com/problems/climbing-stairs/description/
 *70. Climbing Stairs
 * Easy
 * Topics
 * Companies
 * Hint
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 2 steps           + 1 step
 * 3. 1 step + 2 steps
 */

/**
 * Input 4
 * 1. 1 step + 1 step + 1 step + 1 step
 * 2. 2 steps + 1 step + 1 step
 * 3. 1 step + 2 steps + 1 step
 * 4. 1 step + 1 steps + 2 steps
 * 5. 2 steps + 2 steps
 *
 * Input 5
 * 1. 1 step + 1 step + 1 step + 1 step + 1 step
 * 2. 1 step + 1 step + 1 step + 2 steps
 * 3. 1 step + 1 step + 2 steps + 1 step
 * 4. 1 step + 2 steps + 1 step + 1 step
 * 5. 1 step +
 */

class ClimbStairs {
    private val map = mutableMapOf<Int, Int>()
    fun climbStairs(n: Int): Int {
        if (map.contains(n)) {
            return map[n]!!
        }
        if (n <= 2) {
            return n
        }

        map[n] = climbStairs(n - 1) + climbStairs(n - 2)
        return map[n]!!
    }
}

fun main() {
    println(ClimbStairs().climbStairs(3))
    println(ClimbStairs().climbStairs(4))
    println(ClimbStairs().climbStairs(5))
}