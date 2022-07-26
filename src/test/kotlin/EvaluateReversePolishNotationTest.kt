import org.junit.Assert.assertEquals
import org.junit.Test

class EvaluateReversePolishNotationTest {
    @Test
    fun `test 1`() {
        val actual = EvaluateReversePolishNotation().evalRPN(
            arrayOf("4", "13", "5", "/", "+")
        )

        assertEquals(
            actual,
            6
        )
    }
}
