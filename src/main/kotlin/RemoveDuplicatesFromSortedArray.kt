class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        var pos = 0
        var prev = Int.MIN_VALUE
        var cnt = 0
        for (i in nums.indices) {
            val curr = nums[i]
            if (prev == curr) {
                continue
            }
            cnt++
            prev = curr
            nums[pos] = curr
            pos++
        }
        return cnt
    }
}