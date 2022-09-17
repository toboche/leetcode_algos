package leetcode_contests

import org.junit.Test
import kotlin.test.assertContentEquals

class SmallestSubarraysWithMaximumBitwiseORTest {
    @Test
    fun `test 1`() {
        val actual = SmallestSubarraysWithMaximumBitwiseOR().smallestSubarrays(
            intArrayOf(1, 0, 2, 1, 3)
        )
        assertContentEquals(
            intArrayOf(3, 3, 2, 2, 1),
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = SmallestSubarraysWithMaximumBitwiseOR().smallestSubarrays(
            intArrayOf(1, 2)
        )
        assertContentEquals(
            intArrayOf(2, 1),
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = SmallestSubarraysWithMaximumBitwiseOR().smallestSubarrays(
            intArrayOf(0)
        )
        assertContentEquals(
            intArrayOf(1),
            actual
        )
    }

    @Test
    fun `test 4`() {
        val actual = SmallestSubarraysWithMaximumBitwiseOR().smallestSubarrays(
            intArrayOf(1, 0)
        )
        assertContentEquals(
            intArrayOf(1, 1),
            actual
        )
    }
}