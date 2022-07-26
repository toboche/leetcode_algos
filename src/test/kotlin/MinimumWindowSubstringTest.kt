import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumWindowSubstringTest {
    @Test
    fun `test 1`() {
        val actual = MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC")

        assertEquals(
            "BANC",
            actual
        )
    }

    @Test
    fun `test multiple same letters`() {
        val actual = MinimumWindowSubstring().minWindow("a", "aa")

        assertEquals(
            "",
            actual
        )
    }
}