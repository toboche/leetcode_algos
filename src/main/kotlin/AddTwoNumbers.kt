data class ListNode(var `val`: Int, var next: ListNode?) {
    companion object {
        fun fromItems(elements: List<Int>): ListNode? {
            return if (elements.isEmpty()) {
                null
            } else {
                ListNode(elements.first(), fromItems(elements.drop(1)))
            }
        }
    }
}

class AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        return addTwoNumbersInternal(l1, l2, null, 0)
    }

    private fun addTwoNumbersInternal(
        l1: ListNode?, l2: ListNode?,
        out: ListNode?, remainder: Int
    ): ListNode? {
        if (l1 == null && l2 == null) {
            if (remainder != 0) {
                out?.next = ListNode(remainder, null)
            }
            return out
        }
        val i = (l1?.`val` ?: 0) + (l2?.`val` ?: 0) + remainder
        val value = i % 10
        val remainder = i / 10
        val newOut = ListNode(`val` = value, null)
        out?.next = newOut
        addTwoNumbersInternal(l1?.next, l2?.next, newOut, remainder)
        return newOut
    }
}