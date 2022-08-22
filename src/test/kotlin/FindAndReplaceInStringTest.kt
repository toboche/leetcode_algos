import org.junit.Assert.assertEquals
import org.junit.Test

class FindAndReplaceInStringTest {
    @Test
    fun `test 1`() {
        val actual = FindAndReplaceInString().findReplaceString(
            s = "abcd", indices = intArrayOf(0, 2), sources = arrayOf("a", "cd"), targets = arrayOf("eee", "ffff")
        )

        assertEquals(
            "eeebffff",
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = FindAndReplaceInString().findReplaceString(
            s = "abcd", indices = intArrayOf(0, 2), sources = arrayOf("a", "cc"), targets = arrayOf("eee", "ffff")
        )

        assertEquals(
            "eeebcd",
            actual
        )
    }

    @Test
    fun `test out of bounds`() {
        val actual = FindAndReplaceInString().findReplaceString(
            s = "abcd", indices = intArrayOf(0, 2), sources = arrayOf("a", "ccccccc"), targets = arrayOf("eee", "ffff")
        )

        assertEquals(
            "eeebcd",
            actual
        )
    }

}