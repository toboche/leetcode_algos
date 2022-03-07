class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val set = mutableMapOf<Int, List<Int>>()
        for (entry in nums.withIndex()) {
            set.compute(entry.value) { _, value ->
                (value ?: emptyList()) + entry.index
            }
        }
        for (num in nums.withIndex()) {
            val indices = set[target - num.value]
            if (!indices.isNullOrEmpty() && indices.any { it != num.index })
                return intArrayOf(num.index, indices.first { it != num.index })
        }
        return intArrayOf()
    }

    fun twoSum2(nums: IntArray, target: Int): IntArray {
        val set = nums.withIndex().associate { it.value to it.index }
        for (num in nums.withIndex()) {
            val index = set[target - num.value]
            if (index != null && index != num.index)
                return intArrayOf(num.index, index)
        }
        return intArrayOf()
    }
}