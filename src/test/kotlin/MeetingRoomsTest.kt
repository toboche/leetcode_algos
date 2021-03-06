import org.junit.Test
import kotlin.test.assertEquals

class MeetingRoomsTest {
    @Test
    fun `test 1`() {
        val actual =
            MeetingRooms().minMeetingRooms(arrayOf(intArrayOf(0, 30), intArrayOf(5, 10), intArrayOf(15, 20)))

        assertEquals(
            2,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual =
            MeetingRooms().minMeetingRooms(arrayOf(intArrayOf(13, 15), intArrayOf(1, 13)))

        assertEquals(
            1,
            actual
        )
    }
}