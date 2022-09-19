class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val p = (l + r) / 2
            if (nums[p] < target) {
                l = p + 1
            } else if (nums[p] > target) {
                r = p - 1
            } else {
                return p
            }
        }
        return -1
    }
}