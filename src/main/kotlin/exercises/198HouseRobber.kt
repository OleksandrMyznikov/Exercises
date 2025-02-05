package org.example.exercises

import kotlin.math.max

/**
 * 198. House Robber
 * Medium
 * Topics
 * Companies
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 *
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 2:
 *
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 *
 *
 * Constraints:
 *
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */

fun rob(nums: IntArray): Int {
    val map = mutableMapOf<Int, Int>()

    return maxProfit(nums, 0, map)
}

fun maxProfit(nums: IntArray, startIndex: Int, map: MutableMap<Int, Int>): Int {
    if (map.contains(startIndex)) {
        return map[startIndex]!!
    }
    if (nums.size == startIndex + 1) {
        return nums[startIndex]
    }
    else if (nums.size < startIndex + 1) {
        return 0
    }
    var max1 = nums[startIndex] + maxProfit(nums, startIndex + 2, map)
    var max2 = nums[startIndex+1] + maxProfit(nums, startIndex + 3, map)

    map[startIndex] = max(max1, max2)
    return map[startIndex]!!
}



fun main() {
    println(rob(intArrayOf(1,2,3,1)))
    println(rob(intArrayOf(2,7,9,3,1)))
}