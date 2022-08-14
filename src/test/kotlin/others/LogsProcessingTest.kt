package others

import hackerrank.IsomorphicString2
import org.junit.Assert.*
import org.junit.Test

class LogsProcessingTest {
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

}