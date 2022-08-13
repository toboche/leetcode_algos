import com.github.stefanbirkner.systemlambda.SystemLambda
import hackerrank.MiniMaxSum
import org.junit.Assert.*
import org.junit.Test

class NumberOfIslandsTest {
    @Test
    fun `test 1`() {
        val output = NumberOfIslands().numIslands(arrayOf(
            charArrayOf('1','1','1','1','0'),
            charArrayOf('1','1','0','1','0'),
            charArrayOf('1','1','0','0','0'),
            charArrayOf('0','0','0','0','0')
        ))

        assertEquals(
            1,
            output
        )
    }
}