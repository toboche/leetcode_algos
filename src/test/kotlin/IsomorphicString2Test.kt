import hackerrank.IsomorphicString2
import org.junit.Assert.assertEquals
import org.junit.Test

class IsomorphicString2Test {
    @Test
    fun `test 1`() {
        val actual = IsomorphicString2().isIsomorphic(
            "foo",
            "bar"
        )

        assertEquals(
            false,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = IsomorphicString2().isIsomorphic(
            "badc",
            "baba"
        )

        assertEquals(
            false,
            actual
        )
    }
}