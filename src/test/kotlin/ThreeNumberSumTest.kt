import org.junit.Assert.assertEquals
import org.junit.Test

class ThreeNumberSumTest {
    @Test
    fun `test from sample`() {
        val actual: List<List<Int>> = ThreeNumberSum().threeNumberSum(mutableListOf(12, 3, 1, 2, -6, 5, -8, 6), 0)

        assertEquals(
            listOf(
                listOf(
                    -8, 2, 6
                ),
                listOf(
                    -8, 3, 5
                ),
                listOf(
                    -6, 1, 5
                )
            ),
            actual
        )
    }
}