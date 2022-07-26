class RunninSum {
    //Old kotlin solution
    fun runningSum(nums: IntArray): IntArray {
        val toReturn = IntArray(nums.size)
        var sum = 0
        nums.forEachIndexed { index, it ->
            sum += it
            toReturn[index] = sum
        }
        return toReturn
    }
}