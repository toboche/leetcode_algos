import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LetterCombinationsOfAPhoneNumberTest {
    @Test
    fun `sample 1`() {
        val actualValue = LetterCombinationsOfAPhoneNumber().letterCombinations("23")

        assertThat(
            actualValue
        ).containsExactlyInAnyOrderElementsOf(
            listOf("ad","ae","af","bd","be","bf","cd","ce","cf")
        )
    }

    @Test
    fun `empty`() {
        val actualValue = LetterCombinationsOfAPhoneNumber().letterCombinations("")

        assertThat(
            actualValue
        ).containsExactlyInAnyOrderElementsOf(
            listOf(),
        )
    }
}