import org.junit.Assert.assertEquals
import org.junit.Test

class ValidParenthesisTest {
    @Test
    fun `test ()`() {
        val actual = ValidParenthesis().isValid("()")

        assertEquals(
            true,
            actual,
        )
    }

    @Test
    fun `test 2`() {
        val actual = ValidParenthesis().isValid("()[]{}")

        assertEquals(
            true,
            actual,
        )
    }

    @Test
    fun `test 3`() {
        val actual = ValidParenthesis().isValid("(]")

        assertEquals(
            false,
            actual,
        )
    }

    @Test
    fun `test empty`() {
        val actual = ValidParenthesis().isValid("")

        assertEquals(
            true,
            actual,
        )
    }

    @Test
    fun `test single`() {
        val actual = ValidParenthesis().isValid("(")

        assertEquals(
            false,
            actual,
        )
    }
}