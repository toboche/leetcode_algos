class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val map = mutableMapOf<Int, Int>()
        nums.withIndex().forEach {
            map.compute(it.value) { _, _ ->
                it.index
            }
        }
        val matchingIndices = mutableListOf<List<Int>>()
        val visitedIs = mutableSetOf<Int>()
        val visitedJs = mutableSetOf<Int>()
        for (i in nums.indices) {
            if (visitedIs.contains(nums[i])) {
                continue
            }
            for (j in i + 1 until nums.size) {
                if (visitedJs.contains(nums[j])) {
                    continue
                }
                val foundIndex = map[-(nums[i] + nums[j])]
                if (foundIndex != null && foundIndex > j && foundIndex > i) {
                    matchingIndices += listOf(i, j, foundIndex)
                }
                visitedJs += nums[j]
            }
            visitedIs += nums[i]
        }
        return matchingIndices.map { it.map { nums[it] } }
    }
}