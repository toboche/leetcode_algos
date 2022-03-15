import org.junit.Assert.assertEquals
import org.junit.Test

class SubarraySumEqualsKTest {
    @Test
    fun test1() {
        val actual = SubarraySumEqualsK().subarraySum(intArrayOf(1, 1, 1), 3)

        assertEquals(1, actual)
    }

    @Test
    fun test2() {
        val actual = SubarraySumEqualsK().subarraySum(intArrayOf(1, 2, 3), 3)

        assertEquals(2, actual)
    }
}