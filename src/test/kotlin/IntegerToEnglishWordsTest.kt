import org.junit.Assert.assertEquals
import org.junit.Test

class IntegerToEnglishWordsTest {
    @Test
    fun testSingleDigit() {
        val actual = IntegerToEnglishWords().numberToWords(3)

        assertEquals(actual, "Three")
    }

    @Test
    fun test54() {
        val actual = IntegerToEnglishWords().numberToWords(54)

        assertEquals(actual, "Fifty Four")
    }
}