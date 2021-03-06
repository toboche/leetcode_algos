import org.junit.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    @Test
    fun test1() {
        val actual = TwoSum().twoSum(intArrayOf(2, 7, 11, 15), 9)

        assertContentEquals(
            intArrayOf(0, 1), actual
        )
    }

    @Test
    fun test2() {
        val actual = TwoSum().twoSum(intArrayOf(3, 2, 4), 6)

        assertContentEquals(
            intArrayOf(1, 2), actual
        )
    }

    @Test
    fun test3() {
        val actual = TwoSum().twoSum(intArrayOf(3, 3), 6)

        assertContentEquals(
            intArrayOf(0, 1), actual
        )
    }

    @Test
    fun test4() {
        val actual = TwoSum().twoSum2(intArrayOf(2, 7, 11, 15), 9)

        assertContentEquals(
            intArrayOf(0, 1), actual
        )
    }

    @Test
    fun test5() {
        val actual = TwoSum().twoSum2(intArrayOf(3, 2, 4), 6)

        assertContentEquals(
            intArrayOf(1, 2), actual
        )
    }

    @Test
    fun test6() {
        val actual = TwoSum().twoSum2(intArrayOf(3, 3), 6)

        assertContentEquals(
            intArrayOf(0, 1), actual
        )
    }

    @Test
    fun test7() {
        val actual = TwoSum().twoSum3(intArrayOf(2, 7, 11, 15), 9)

        assertContentEquals(
            intArrayOf(1, 0), actual
        )
    }

    @Test
    fun test8() {
        val actual = TwoSum().twoSum3(intArrayOf(3, 2, 4), 6)

        assertContentEquals(
            intArrayOf(2, 1), actual
        )
    }

    @Test
    fun test9() {
        val actual = TwoSum().twoSum3(intArrayOf(3, 3), 6)

        assertContentEquals(
            intArrayOf(1, 0), actual
        )
    }
}