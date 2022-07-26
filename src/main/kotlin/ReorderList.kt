class ReorderList {
    fun reorderList(head: ListNode?): Unit {
        if (head == null) {
            return
        }

        //find middle
        var slow: ListNode? = head
        var fast: ListNode? = head.next
        while (fast != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        //reverse starting in middle
        var prev: ListNode? = null
        var curr = slow
        while (curr != null) {
            val tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        }
        slow?.next = null

        var head1 = head.next
        var head2 = prev
        var tail: ListNode? = null

        while (head2 != null) {
            if (tail == null) {
                tail = head1
                head1 = head1?.next
            } else {
                tail.next = head1
                head1 = head1?.next
            }
            tail?.next = head2
            head2 = head2.next

            tail = tail?.next
        }

//        while (head2 != null) {
//            tail?.next = ListNode(head2.`val`, null)
//            head2 = head2.next
//            tail = tail?.next
//            tail?.next = if (head1 != null) ListNode(head1.`val`, null) else null
//            head1 = head1?.next
//            tail = tail?.next
//        }
//        tail?.next = null


//        var curr = slow
//        var prev: ListNode? = null
//        while (curr != null) {
//            val next = curr.next
//            curr = ListNode(curr.`val`, prev)
//            prev = curr
//            curr = next
//        }
//        var head2 = prev
//        var head1 = head
//        var tail: ListNode? = head
//        while (head2 != null) {
//            if (head1 != null) {
//                tail?.next = head1
//                tail = head1.next
//            }
//            tail?.next = head2
//            tail = tail?.next!!
//            head1 = head1!!.next
//            head2 = head2.next
//        }
    }
}