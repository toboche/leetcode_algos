import kotlin.collections.HashMap

class LRUCache(val capacity: Int) {
    class DLinkedNode(
        var key: Int,
        var value: Int,
        var next: DLinkedNode?,
        var previous: DLinkedNode?,
    )

    private val head: DLinkedNode = DLinkedNode(-1, -1, null, null)
    private val tail: DLinkedNode = DLinkedNode(-1, -1, null, null)
    private val map = HashMap<Int, DLinkedNode>()

    init {
        head.next = tail
        tail.previous = head
    }

    fun get(key: Int): Int {
        val entry = map[key]
        return if (entry == null) {
            -1
        } else {
            removeFromList(entry)
            linkToHead(entry)
            entry.value
        }
    }

    private fun removeFromList(entry: DLinkedNode) {
        val left = entry.previous!!
        val right = entry.next!!
        entry.next = null
        entry.previous = null
        left.next = right
        right.previous = left
    }

    private fun linkToHead(entry: DLinkedNode) {
        val nextForEntry = head.next!!
        head.next = entry
        entry.previous = head
        entry.next = nextForEntry
        nextForEntry.previous = entry
    }

    fun put(key: Int, value: Int) {
        if (map.containsKey(key)) {
            val existingEntry = map[key]!!
            existingEntry.value = value
            removeFromList(existingEntry)
            linkToHead(existingEntry)
            return
        } else if (map.count() >= capacity) {
            val lastItem = tail.previous!!
            removeFromList(lastItem)
            map.remove(lastItem.key)
        }
        val newItem = DLinkedNode(
            key,
            value,
            null,
            null
        )
        linkToHead(newItem)
        map.put(key, newItem)
    }
}