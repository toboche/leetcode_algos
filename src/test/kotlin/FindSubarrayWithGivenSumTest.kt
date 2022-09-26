import org.junit.Assert.assertEquals
import org.junit.Test

class FindSubarrayWithGivenSumTest {
    @Test
    fun `test from sample`() {
        val actual = FindSubarrayWithGivenSum().subArraySum(intArrayOf(1, 4, 20, 3, 10, 5), 33)

        assertEquals(
            2 to 4,
            actual
        )
    }

    @Test
    fun `empty`() {
        val actual = FindSubarrayWithGivenSum().subArraySum(intArrayOf(), 33)

        assertEquals(
            null,
            actual
        )
    }

    @Test
    fun `zero target`() {
        val actual = FindSubarrayWithGivenSum().subArraySum(intArrayOf(1, 2, 3, 4), 0)

        assertEquals(
            0 to 0,
            actual
        )
    }

}