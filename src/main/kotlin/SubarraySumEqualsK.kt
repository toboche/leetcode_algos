class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val list = nums.toList()
        var count = 0
        for (i in nums.indices) {
            for (j in i + 1..nums.size) {
                if (list.subList(i, j).sum() == k) {
                    count++
                }
            }
        }
        return count
    }
}