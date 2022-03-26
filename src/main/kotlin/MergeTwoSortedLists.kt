class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head1 = list1
        var head2 = list2
        var head: ListNode? = null
        var tail: ListNode? = null
        while (head1 != null || head2 != null) {
            tail = if ((head1?.`val` ?: Int.MAX_VALUE) < (head2?.`val` ?: Int.MAX_VALUE)) {
                val new = ListNode(head1!!.`val`, null)
                head1 = head1.next
                if (tail == null) {
                    tail = new
                } else {
                    tail.next = new
                    tail = new
                }
                tail
            } else {
                val new = ListNode(head2!!.`val`, null)
                head2 = head2.next
                if (tail == null) {
                    tail = new
                } else {
                    tail.next = new
                    tail = new
                }
                tail
            }
            if (head == null) {
                head = tail
            }
        }
        return head
    }

}