data class ListNode(var value: Int, var next: ListNode?)

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var n1 = l1
        var n2 = l2
        var remainder = 0
        val fakeHead = ListNode(-1, null)
        var tail: ListNode = fakeHead
        while (n1 != null || n2 != null) {
            val sum = (n1?.value ?: 0) + (n2?.value ?: 0) + remainder
            val value = sum % 10
            remainder = sum / 10
            tail.next = ListNode(value, null)
            tail = tail.next!!
            n1 = n1?.next
            n2 = n2?.next
        }
        if (remainder != 0) {
            tail.next = ListNode(remainder, null)
        }
        return fakeHead.next
    }
}