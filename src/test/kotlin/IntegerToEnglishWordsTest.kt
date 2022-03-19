import org.junit.Assert.assertEquals
import org.junit.Test

class IntegerToEnglishWordsTest {
    @Test
    fun testSingleDigit() {
        val actual = IntegerToEnglishWords().numberToWords(3)

        assertEquals(actual, "Three")
    }
}