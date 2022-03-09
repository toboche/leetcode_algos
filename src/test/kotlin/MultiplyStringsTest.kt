import org.junit.Assert.assertEquals
import org.junit.Test

class MultiplyStringsTest {
    @Test
    fun test1() {
        val actual = MultiplyStrings().multiply("2", "3")
        assertEquals("6", actual)
    }

    @Test
    fun test2() {
        val actual = MultiplyStrings().multiply("123", "456")
        assertEquals("56088", actual)
    }
}