import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.test.assertContentEquals

class RemoveDuplicatesFromSortedArrayTest {
    @Test
    fun name() {
        val nums = intArrayOf(1, 1, 2)
        val actual = RemoveDuplicatesFromSortedArray().removeDuplicates(nums)

        assertEquals(2, actual)
        assertContentEquals(intArrayOf(1, 2, 2), nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val actual = RemoveDuplicatesFromSortedArray().removeDuplicates(nums)

        assertEquals(5, actual)
        assertContentEquals(intArrayOf(0, 1, 2, 3, 4, 2, 2, 3, 3, 4), nums)
    }
}