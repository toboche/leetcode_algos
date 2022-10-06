class MaxSubsetSumNoAdjacent {
    fun maxSubsetSumNoAdjacent(array: List<Int>): Int {
        if (array.isEmpty()) return 0
        if (array.size == 1) return array[0]
        var prev = array[1]
        var prevPrev = array[0]
        for (i in 2..array.lastIndex) {
            val tmp = prev
            prev = prevPrev + array[i]
            prevPrev = Math.max(tmp, prevPrev)
        }
        return Math.max(prev, prevPrev)
    }
}