import org.junit.Assert.*
import org.junit.Test

class StringToIntegerTest {
    @Test
    fun test1() {
        val actual = StringToInteger().myAtoi("42")
        assertEquals(42, actual)
    }

    @Test
    fun test2() {
        val actual = StringToInteger().myAtoi("   -42")
        assertEquals(-42, actual)
    }

    @Test
    fun test3() {
        val actual = StringToInteger().myAtoi("4193 with words")
        assertEquals(4193, actual)
    }

    @Test
    fun test4() {
        val actual = StringToInteger().myAtoi("words and 987")
        assertEquals(0, actual)
    }

    @Test
    fun test5() {
        val actual = StringToInteger().myAtoi("-91283472332")
        assertEquals(-2147483648, actual)
    }

    @Test
    fun test6() {
        val actual = StringToInteger().myAtoi("+-12")
        assertEquals(0, actual)
    }
}