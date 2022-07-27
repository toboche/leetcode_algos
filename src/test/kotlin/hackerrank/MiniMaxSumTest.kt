package hackerrank

import com.github.stefanbirkner.systemlambda.SystemLambda
import org.junit.Assert.*
import org.junit.Test

class MiniMaxSumTest {
    @Test
    fun `test 1`() {
        val output = SystemLambda.tapSystemOut {
            MiniMaxSum().miniMaxSum(arrayOf(1, 2, 3, 4, 5))
        }

        assertEquals(
            "10 14",
            output.trim()
        )
    }
}