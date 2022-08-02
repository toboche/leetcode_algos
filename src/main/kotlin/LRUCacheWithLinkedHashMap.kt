class LRUCacheWithLinkedHashMap(capacity: Int) {
    val linkedHashMap = object : LinkedHashMap<Int, Int>(capacity, 0.75f, true) {
        override fun removeEldestEntry(eldest: MutableMap.MutableEntry<Int, Int>?): Boolean {
            return size > capacity
        }
    }

    fun get(key: Int): Int {
        return linkedHashMap.getOrDefault(key, -1)
    }

    fun put(key: Int, value: Int) {
        linkedHashMap.put(key, value)
    }
}