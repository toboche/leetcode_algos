import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumSumOfSquaredDifferenceTest {
    @Test
    fun `test 1`() {
        val actual = MinimumSumOfSquaredDifference().minSumSquareDiff(
            intArrayOf(1, 4, 10, 12),
            intArrayOf(5, 8, 6, 9),
            0,
            2
        )

        assertEquals(
            43,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = MinimumSumOfSquaredDifference().minSumSquareDiff(
            intArrayOf(1),
            intArrayOf(1),
            1,
            1
        )

        assertEquals(
            0,
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = MinimumSumOfSquaredDifference().minSumSquareDiff(
            intArrayOf(1),
            intArrayOf(3),
            2,
            0
        )

        assertEquals(
            0,
            actual
        )
    }

    @Test
    fun `test 4`() {
        val actual = MinimumSumOfSquaredDifference().minSumSquareDiff(
            intArrayOf(1),
            intArrayOf(3),
            0,
            2
        )

        assertEquals(
            0,
            actual
        )
    }
}