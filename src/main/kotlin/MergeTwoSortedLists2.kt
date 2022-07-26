class MergeTwoSortedLists2 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var list1 = list1
        var list2 = list2
        var head: ListNode? = null
        var tail: ListNode? = null
        while (list1 != null || list2 != null) {
            if (list1 == null && list2 == null) {
                break
            }
            val next = if (list1 == null) {
                val next = ListNode(list2!!.`val`)
                list2 = list2.next
                next
            } else if (list2 == null) {
                val next = ListNode(list1.`val`)
                list1 = list1.next
                next
            } else if (list1.`val` < list2.`val`) {
                val next = ListNode(list1.`val`)
                list1 = list1.next
                next
            } else {
                val next = ListNode(list2.`val`)
                list2 = list2.next
                next
            }
            tail?.next = next
            if (head == null) {
                head = next
            }
            tail = next
        }
        return head

    }
}