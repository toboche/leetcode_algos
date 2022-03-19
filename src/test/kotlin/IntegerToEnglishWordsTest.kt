import org.junit.Assert.assertEquals
import org.junit.Test

class IntegerToEnglishWordsTest {
    @Test
    fun testSingleDigit() {
        val actual = IntegerToEnglishWords().numberToWords(3)

        assertEquals(actual, "Three")
    }

    @Test
    fun testSingleZero() {
        val actual = IntegerToEnglishWords().numberToWords(0)

        assertEquals(actual, "Zero")
    }

    @Test
    fun test54() {
        val actual = IntegerToEnglishWords().numberToWords(54)

        assertEquals(actual, "Fifty Four")
    }

    @Test
    fun test11() {
        val actual = IntegerToEnglishWords().numberToWords(11)

        assertEquals(actual, "Eleven")
    }

    @Test
    fun test19() {
        val actual = IntegerToEnglishWords().numberToWords(19)

        assertEquals(actual, "Nineteen")
    }
}