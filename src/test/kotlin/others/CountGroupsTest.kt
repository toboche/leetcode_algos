package others

import org.junit.Assert.assertEquals
import org.junit.Test

class CountGroupsTest {
    @Test
    fun `test 1`() {
        val actual = CountGroups().countGroups(
            arrayOf(
                "1100",
                "1110",
                "0110",
                "0001",
            )
        )
        assertEquals(
            2,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = CountGroups().countGroups(
            arrayOf(
                "10000",
                "01000",
                "00100",
                "00010",
                "00001",
            )
        )
        assertEquals(
            5,
            actual
        )
    }

}