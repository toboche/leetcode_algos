import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


@RunWith(Parameterized::class)
class IntegerToEnglishWordsTest(val int: Int, val expected: String) {
    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun primeNumbers(): Collection<*> {
            return listOf(
                arrayOf<Any>(2, "Two"),
                arrayOf<Any>(0, "Zero"),
                arrayOf<Any>(10, "Ten"),
                arrayOf<Any>(54, "Fifty Four"),
                arrayOf<Any>(11, "Eleven"),
                arrayOf<Any>(19, "Nineteen"),
                arrayOf<Any>(20, "Twenty"),
                arrayOf<Any>(21, "Twenty One"),
                arrayOf<Any>(99, "Ninety Nine"),
                arrayOf<Any>(100, "One Hundred"),
                arrayOf<Any>(101, "One Hundred One"),
                arrayOf<Any>(111, "One Hundred Eleven"),
                arrayOf<Any>(136, "One Hundred Thirty Six"),
                arrayOf<Any>(567, "Five Hundred Sixty Seven"),
                arrayOf<Any>(999, "Nine Hundred Ninety Nine"),
                arrayOf<Any>(234567, "Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
                arrayOf<Any>(1234567, "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"),
            )
        }
    }

    @Test
    fun testValue() {
        val actual = IntegerToEnglishWords().numberToWords(int)

        assertEquals(actual, expected)
    }

}