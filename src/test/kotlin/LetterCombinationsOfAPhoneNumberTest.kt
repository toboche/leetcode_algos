import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals

class LetterCombinationsOfAPhoneNumberTest {
    @Test
    fun `sample 1`() {
        val actualValue = LetterCombinationsOfAPhoneNumber().letterCombinations("23")

        assertContentEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            actualValue
        )
    }

    @Test
    fun `empty`() {
        val actualValue = LetterCombinationsOfAPhoneNumber().letterCombinations("23")

        assertContentEquals(
            listOf("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"),
            actualValue
        )
    }
}