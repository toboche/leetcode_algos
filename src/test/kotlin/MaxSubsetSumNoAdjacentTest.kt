import org.junit.Assert.assertEquals
import org.junit.Test

class MaxSubsetSumNoAdjacentTest {
    @Test
    fun `test from sample`() {
        val actual = MaxSubsetSumNoAdjacent().maxSubsetSumNoAdjacent(listOf(75, 105, 120, 75, 90, 135))

        assertEquals(
            330,
            actual
        )
    }

    @Test
    fun `empty`() {
        val actual = MaxSubsetSumNoAdjacent().maxSubsetSumNoAdjacent(listOf())

        assertEquals(
            0,
            actual
        )
    }
}