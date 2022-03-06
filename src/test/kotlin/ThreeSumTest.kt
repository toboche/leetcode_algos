import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertContains
import kotlin.test.assertContentEquals

class ThreeSumTest {
    @Test
    fun `test from sample`() {
        val actual: List<List<Int>> = ThreeSum().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))

        assertEquals(
            listOf(
                listOf(
                    -1, 0, 1
                ),
                listOf(
                    -1, -1, 2
                )
            ),
            actual
        )
    }

    @Test
    fun `multiple same solutions`() {
        val actual = ThreeSum().threeSum(intArrayOf(0, 0, 0, 0))

        assertEquals(
            listOf(
                listOf(
                    0, 0, 0
                )
            ),
            actual
        )
    }

    @Test
    fun `multiple same solutions with different ordering`() {
        val actual = ThreeSum().threeSum(intArrayOf(-1, 0, 1, 0))

        assertEquals(
            listOf(
                listOf(
                    -1, 0, 1
                )
            ),
            actual
        )
    }

    @Test
    fun `empty data set`() {
        val actual = ThreeSum().threeSum(intArrayOf())

        assertEquals(
            emptyList<List<Int>>(),
            actual
        )
    }
}