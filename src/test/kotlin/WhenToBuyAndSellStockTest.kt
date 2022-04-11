import org.junit.Test
import kotlin.test.assertEquals

class WhenToBuyAndSellStockTest {
    @Test
    fun `sample 1`() {
        val actual = WhenToBuyAndSellStock().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))

        assertEquals(5, actual)
    }
}