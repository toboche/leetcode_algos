import org.junit.Assert.assertEquals
import org.junit.Test

class AddBinaryTest {
    @Test
    fun test1() {
        val actual = AddBinary().addBinary("11", "1")

        assertEquals("100", actual)
    }

    @Test
    fun test2() {
        val actual = AddBinary().addBinary("1010", "1011")

        assertEquals("10101", actual)
    }
}