class FindPivotIndex {
    fun pivotIndex(nums: IntArray): Int {
        var right = nums.sum()
        var left = 0
        for (i in nums.indices) {
            if (i > 0) {
                left += nums[i - 1]
            }
            right -= nums[i]
            if (left == right) {
                return i
            }
        }
        return -1
    }
}