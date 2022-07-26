import org.junit.Assert.*
import org.junit.Test

class IsomorphicStringTest {
    @Test
    fun `test 1`() {
        val actual = IsomorphicString().isIsomorphic(
            "foo",
            "bar"
        )

        assertEquals(
            false,
            actual
        )
    }
}