import org.junit.Assert.assertEquals
import org.junit.Test

class SubsequenceTest {
    @Test
    fun `test 1`() {
        val actual = Subsequence().isSubsequence(
            s = "abc", t = "ahbgdc"
        )

        assertEquals(
            true,
            actual
        )
    }
    
    @Test
    fun `test 2`() {
        val actual = Subsequence().isSubsequence(
            s = "axc", t = "ahbgdc"
        )

        assertEquals(
            false,
            actual
        )
    }
}