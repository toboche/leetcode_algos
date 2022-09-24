class ThreeNumberSum {
    fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
        val sorted = array.sorted()
        val toReturn = mutableListOf<List<Int>>()
        for (i in sorted.indices) {
            val current = sorted[i]
            var left = i + 1
            var right = sorted.size - 1
            while (left < right) {
                val leftValue = sorted[left]
                val rightValue = sorted[right]
                val currentSum = leftValue + rightValue + current
                if (currentSum == targetSum) {
                    toReturn.add(listOf(current, leftValue, rightValue))
                    left += 1
                    right -= 1
                } else if (currentSum < targetSum) {
                    left += 1
                } else {
                    right -= 1
                }
            }
        }

        return toReturn
    }

    fun threeNumberSumNotOptimal(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
        val sorted = array.sorted()
        val toSet = array.toMutableSet()
        val toReturn = mutableListOf<List<Int>>()
        for (i in sorted.indices) {
            val ith = sorted[i]
            toSet.remove(ith)
            for (j in i + 1 until sorted.size) {
                val jth = sorted[j]
                val missing = targetSum - ith - jth
                if (missing <= jth) {
                    continue
                }
                if (toSet.contains(missing)) {
                    toReturn.add(listOf(ith, jth, missing))
                }
            }
        }

        return toReturn
    }

}