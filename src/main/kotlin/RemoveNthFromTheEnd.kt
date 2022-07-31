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
}