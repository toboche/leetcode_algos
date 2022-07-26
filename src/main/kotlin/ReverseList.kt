class ReverseList {
    fun reverseList(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr = head
        while(curr!=null){
            val nextTmp = curr.next
            curr.next = prev
            prev = curr
            curr = nextTmp
        }
        return prev
    }
}