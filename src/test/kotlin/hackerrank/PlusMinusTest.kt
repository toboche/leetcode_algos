package hackerrank

import com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut
import org.junit.Assert.*
import org.junit.Test

class PlusMinusTest {
    @Test
    fun `test 1`() {
        val output = tapSystemOut {
            PlusMinus().plusMinus(arrayOf(-4, 3, -9, 0, 4, 1))
        }

        assertEquals(
            "0.500000\n" +
                    "0.333333\n" +
                    "0.166667",
            output.trim()
        )
    }

    @Test
    fun `test empty`() {
        val output = tapSystemOut {
            PlusMinus().plusMinus(arrayOf())
        }

        assertEquals(
            "0.000000\n" +
                    "0.000000\n" +
                    "0.000000",
            output.trim()
        )
    }
}