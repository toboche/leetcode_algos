import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals

class ThreeSumTest {
    @Test
    fun test1() {
        val actual: List<List<Int>> = ThreeSum().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        assertContentEquals(
            listOf(
                listOf(
                    -1, 0, 1
                ),
                listOf(
                    -1, 2, -1
                )
            ),
            actual
        )
    }

    @Test
    fun test2() {
        val actual = ThreeSum().threeSum(intArrayOf(0, 0, 0, 0))

        assertContentEquals(
            listOf(
                listOf(
                    0, 0, 0
                )
            ),
            actual
        )
    }
}