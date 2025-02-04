package org.example.exercises

import org.example.datastructures.LinkedList
class ListNode(var `val`: Int) {
        var next: ListNode? = null
}
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var leftover = 0
    var node1 = l1
    var node2 = l2
    var result: ListNode? = null
    while(node1 != null && node2 != null) {
        val item1 = node1.`val`
        val item2 = node2.`val`
        var sum = item1 + item2 + leftover
        leftover = 0

        if (sum > 9) {
            leftover = sum - 9
            sum = sum - leftover
        }

        node1 = l1?.next
        node2 = l2?.next
        if (result == null) {
            result = ListNode(sum)
        } else {
            result.next = ListNode(sum)
        }

    }
    return result
}