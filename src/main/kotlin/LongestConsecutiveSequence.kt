class LongestConsecutiveSequence {
    fun longestConsecutive(nums: IntArray): Int {
        var longest = 0
        val set = nums.toHashSet()
        for (n in nums) {
            var cur = n
            var curStreak = 1

            if (set.contains(cur - 1)) {
                continue
            }

            while (set.contains(cur + 1)) {
                curStreak += 1
                cur += 1
            }

            longest = Math.max(curStreak, longest)
        }

        return longest
    }
}