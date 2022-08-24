import org.junit.Assert.assertArrayEquals
import org.junit.Test

class CourseScheduleIITest {
    @Test
    fun `test 1`() {
        val actual = CourseScheduleII().findOrder(
            2,
            arrayOf(
                intArrayOf(1, 0)
            )
        )

        assertArrayEquals(
            intArrayOf(0, 1),
            actual
        )
    }

}