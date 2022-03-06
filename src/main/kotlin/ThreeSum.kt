class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val set = nums.withIndex().associate { it.value to it.index }

        val foundCombinations = mutableSetOf<Triple<Int, Int, Int>>()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                val missing = -(nums[i] + nums[j])
                val foundIndex = set[missing]
                if (foundIndex != null && foundIndex != j && foundIndex != i) {
                    val ordered = listOf(i, j, foundIndex)
                        .map { nums[it] }
                        .sorted()
                    foundCombinations.add(
                        Triple(
                            ordered[0], ordered[1], ordered[2]
                        )
                    )
                }
            }
        }
        return foundCombinations.toList()
            .toSet()
            .map { listOf(it.first, it.second, it.third) }
    }
}