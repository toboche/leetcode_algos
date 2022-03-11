import org.junit.Test
import kotlin.test.assertContentEquals

class MoveZeroesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0)
        MoveZeroes().moveZeroes(nums)

        assertContentEquals(intArrayOf(0), nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0, 3, 12)
        MoveZeroes().moveZeroes(nums)

        assertContentEquals(intArrayOf(1, 3, 12, 0, 0), nums)
    }
}