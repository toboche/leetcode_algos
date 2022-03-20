class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        if (n == 0) {
            return
        }
        var nums1Index = 0
        var nums2Index = 0
        var index = 0
        val nums1Copy = nums1.copyOf()
        while (nums1Index < m || nums2Index < n) {
            val num1 = nums1Copy.getOrNull(nums1Index)
            val num2 = nums2.getOrNull(nums2Index)
            if (num1 == null) {
                nums1[index] = num2!!
                nums2Index++
            } else if (num2 == null) {
                nums1[index] = num1
                nums1Index++
            } else if (num1 < num2 && nums1Index < m) {
                nums1[index] = num1
                nums1Index++
            } else {
                nums1[index] = num2
                nums2Index++
            }
            index++
        }
    }
}