class FindSubarrayWithGivenSum {
    fun subArraySum(array: IntArray, target: Int): Pair<Int, Int>? {
        if (array.size == 0) {
            return null
        }
        if (target == 0) {
            return 0 to 0
        }
        var left = 0
        var right = 0
        var currentSum = array[0]
        while (true) {
            if (currentSum == target) {
                return left to right
            } else if (currentSum > target && left < array.size - 1) {
                currentSum -= array[left]
                left += 1
            } else if (currentSum > target) {
                return null
            } else if (currentSum < target && right == array.size - 1) {
                return null
            } else if (currentSum < target) {
                right += 1
                currentSum += array[right]
            }
        }
    }
}