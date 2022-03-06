import org.junit.Assert.*
import org.junit.Test

class RomanToInteger2Test {
    @Test
    fun test1() {
        val actual = RomanToInteger2().romanToInt("III")
        assertEquals(3, actual)
    }

    @Test
    fun test2() {
        val actual = RomanToInteger2().romanToInt("LVIII")
        assertEquals(58, actual)
    }

    @Test
    fun test3() {
        val actual = RomanToInteger2().romanToInt("MCMXCIV")
        assertEquals(1994, actual)
    }
}