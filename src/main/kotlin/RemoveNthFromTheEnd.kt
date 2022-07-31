class RemoveNthFromTheEnd {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var cnt = 0
        var node = head

        while (node != null) {
            cnt++
            node = node.next
        }

        var currentDepth = 0
        node = head
        var prev: ListNode? = null
        var newHead: ListNode? = null

        while (node != null) {
            currentDepth++
            if (cnt - currentDepth + 1 == n) {
                prev?.next = null
            } else {
                if (newHead == null) {
                    newHead = node
                }
                prev?.next = node
                prev = node
            }
            node = node.next
        }
        return newHead
    }

    fun removeNthFromEnd2(head: ListNode?, n: Int): ListNode? {
        var dst = 0
        val synth = ListNode(111)
        synth.next = head
        var right: ListNode? = synth
        var left: ListNode? = synth

        while (right?.next != null) {
            if (dst < n) {
                dst++
                right = right.next
            } else {
                right = right.next
                left = left?.next
            }
        }
        if (dst == n) {
            if (left == head) {
                return head?.next
            } else {
                left?.next = left?.next?.next
            }
        }
        return synth.next
    }
}