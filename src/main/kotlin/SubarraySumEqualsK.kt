class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var cumulativeSum = 0
        val occurrenceFrequencies = mutableMapOf<Int, Int>()
        occurrenceFrequencies[0] = 1
        for (i in nums.indices) {
            cumulativeSum += nums[i]
            if (occurrenceFrequencies.containsKey(cumulativeSum - k)) {
                count += occurrenceFrequencies[cumulativeSum - k]!!
            }
            occurrenceFrequencies.compute(cumulativeSum) { _, currentCount ->
                (currentCount ?: 0) + 1
            }
        }
        return count
    }
}