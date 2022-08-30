import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumMovesToConvertAStringTest {
    @Test
    fun `test 1`() {
        val actual = MinimumMovesToConvertAString().minimumMoves("XXOX")


        assertEquals(
            2,
            actual
        )
    }
    @Test
    fun `test 2`() {
        val actual = MinimumMovesToConvertAString().minimumMoves("XXX")


        assertEquals(
            1,
            actual
        )
    }
    @Test
    fun `test 3`() {
        val actual = MinimumMovesToConvertAString().minimumMoves("OOOO")


        assertEquals(
            0,
            actual
        )
    }
}