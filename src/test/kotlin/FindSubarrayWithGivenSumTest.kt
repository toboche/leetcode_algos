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



}