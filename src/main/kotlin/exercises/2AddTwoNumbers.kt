package org.example.exercises

class ListNode(var `val`: Int) {
        var next: ListNode? = null
}

/**
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * 2. Add Two Numbers
 * Solved
 * Medium
 * Topics
 * Companies
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 */
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    return addTwoNumbers(l1, l2, 0)
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?, leftover: Int): ListNode? {
    if (l1 == null && l2 == null) {
        if (leftover > 0) {
            return ListNode(leftover)
        }
        return null
    }

    var sum = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + leftover
    var newLeftover = sum / 10
    sum -= newLeftover * 10

    return ListNode(sum).apply {
        next = addTwoNumbers(l1?.next, l2?.next, newLeftover)
    }
}

fun main() {

}