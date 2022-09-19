import org.junit.Assert.assertEquals
import org.junit.Test

class BinarySearchTest {
    @Test
    fun test1() {
        val actual = BinarySearch().search(intArrayOf(-1, 0, 3, 5, 9, 12), 9)

        assertEquals(
            4,
            actual
        )
    }

    @Test
    fun test2() {
        val actual = BinarySearch().search(intArrayOf(-1, 0, 3, 5, 9, 12), 12)

        assertEquals(
            5,
            actual
        )
    }

    @Test
    fun test3() {
        val actual = BinarySearch().search(intArrayOf(-1, 0, 3, 5, 9, 12), -1)

        assertEquals(
            0,
            actual
        )
    }

    @Test
    fun test4() {
        val actual = BinarySearch().search(intArrayOf(-1, 0, 3, 5, 9, 12), 3)

        assertEquals(
            2,
            actual
        )
    }

    @Test
    fun test5() {
        val actual = BinarySearch().search(intArrayOf(-1, 0, 3, 5, 9, 12), 2)

        assertEquals(
            -1,
            actual
        )
    }

}