class ReorderList {
    fun reorderList(head: ListNode?): Unit {
        if (head == null) {
            return
        }

        val list = mutableListOf<ListNode>()
        var tail: ListNode? = head
        while (tail?.next != null) {
            list.add(tail)
            tail = tail.next
        }
        if (tail != null) list.add(tail)

        val reordered = mutableListOf<ListNode>()
        for (i in 0..(list.size - 1) / 2) {
            reordered.add(list[i])
            if (list.size - 1 - i != i) {
                reordered.add(list[list.size - 1 - i])
            }
        }
        tail = head
        for (i in 1 until reordered.size) {
            tail!!.next = ListNode(reordered[i].`val`, null)
            tail = tail.next!!
        }
    }
}