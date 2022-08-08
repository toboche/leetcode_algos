import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class MinimumWindowSubstring2Test {
    @Test
    fun `sample 1`() {
        val actual = MinimumWindowSubstring2().minWindow(
            "ADOBECODEBANC",
            "ABC"
        )

        assertThat(actual).isEqualTo("BANC")
    }

    @Test
    fun `sample 2`() {
        val actual = MinimumWindowSubstring2().minWindow(
            "a",
            "aa"
        )

        assertThat(actual).isEqualTo("")
    }
}