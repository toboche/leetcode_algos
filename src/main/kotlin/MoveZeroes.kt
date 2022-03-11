class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var pos = 0
        for (i in 0 until nums.size) {
            val num = nums[i]
            if (nums[i] != 0) {
                nums[pos] = num
                pos++
            }
        }
        for (i in pos until nums.size) {
            nums[i] = 0
        }
    }
}