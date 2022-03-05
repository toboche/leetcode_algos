import org.junit.Assert.*
import org.junit.Test

class RomanToIntegerTest {
    @Test
    fun test1() {
        val actual = RomanToInteger().romanToInt("III")
        assertEquals(3, actual)
    }

    @Test
    fun test2() {
        val actual = RomanToInteger().romanToInt("LVIII")
        assertEquals(58, actual)
    }

    @Test
    fun test3() {
        val actual = RomanToInteger().romanToInt("MCMXCIV")
        assertEquals(1994, actual)
    }
}