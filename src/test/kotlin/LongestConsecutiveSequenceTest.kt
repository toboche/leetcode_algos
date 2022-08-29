import org.junit.Assert.assertEquals
import org.junit.Test

class LongestConsecutiveSequenceTest {
    @Test
    fun `test 1`() {
        val actual = LongestConsecutiveSequence().longestConsecutive(
            intArrayOf(100, 4, 200, 1, 3, 2)
        )
        assertEquals(
            4,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = LongestConsecutiveSequence().longestConsecutive(
            intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)
        )
        assertEquals(
            9,
            actual
        )
    }
}