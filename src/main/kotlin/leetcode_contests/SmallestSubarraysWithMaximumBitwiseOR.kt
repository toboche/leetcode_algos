package leetcode_contests

class SmallestSubarraysWithMaximumBitwiseOR {
    fun smallestSubarrays(nums: IntArray): IntArray {
        val maxOr = nums.fold(0) { acc, it ->
            acc.or(it)
        }
        val ret = IntArray(nums.size)
        val maxLen = nums.maxOrNull()!!.toString(2).length
        val lastOccurences = IntArray(maxLen) { -1 }
        val firstOccurrences = IntArray(maxLen) { -1 }
        nums.forEachIndexed { numIndex, num ->
            num.toString(2).reversed().forEachIndexed { bitIndex, bit ->
                if (bit == '1') {
                    lastOccurences[bitIndex] = numIndex
                    if (firstOccurrences[bitIndex] == -1) {
                        firstOccurrences[bitIndex] = numIndex
                    }
                }
            }
        }
        val localLastOccurences = IntArray(maxLen) { -1 }
        var dest = maxOr
        var end = -1
        var curOr = 0
        for (i in nums.indices) {
            while (curOr < dest) {
                end++
                val endValue = nums[end]
                curOr = curOr.or(endValue)
                endValue.toString(2).reversed().forEachIndexed { index, bit ->
                    if (bit == '1')
                        localLastOccurences[index] = end
                }
            }
            ret[i] = Math.max(end - i + 1, 1)
            lastOccurences.forEachIndexed { binIndex, lastOcc ->
                if (i == lastOcc) {
                    dest = dest.xor((1 shl binIndex))
                }
            }

            localLastOccurences.forEachIndexed { binIndex, lastOcc ->
                if (i == lastOcc) {
                    curOr = curOr.xor((1 shl binIndex))
                }
            }
        }
        return ret
    }
}