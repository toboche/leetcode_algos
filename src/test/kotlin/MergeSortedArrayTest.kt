import org.junit.Test
import kotlin.test.assertContentEquals

class MergeSortedArrayTest {
    @Test
    fun test1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        MergeSortedArray().merge(nums1 = nums1, m = 3, nums2 = intArrayOf(2, 5, 6), n = 3)

        assertContentEquals(
            intArrayOf(1, 2, 2, 3, 5, 6),
            nums1
        )
    }

    @Test
    fun test2() {
        val nums1 = intArrayOf(0)
        MergeSortedArray().merge(nums1 = nums1, m = 0, nums2 = intArrayOf(1), n = 1)

        assertContentEquals(
            intArrayOf(1),
            nums1
        )
    }
}