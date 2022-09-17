package leetcode_contests

import org.junit.Assert.assertEquals
import org.junit.Test

class CountDaysSpentTogetherTest {
    @Test
    fun `test 1`() {
        val actual = CountDaysSpentTogether().countDaysTogether(
            arriveAlice = "08-15",
            leaveAlice = "08-18",
            arriveBob = "08-16",
            leaveBob = "08-19"
        )

        assertEquals(
            3,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = CountDaysSpentTogether().countDaysTogether(
            arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob = "12-31"
        )

        assertEquals(
            0,
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = CountDaysSpentTogether().countDaysTogether(
            "10-20",
            "12-22",
            "06-21",
            "07-05"
        )

        assertEquals(
            0,
            actual
        )
    }
    @Test
    fun `test 4`() {
        val actual = CountDaysSpentTogether().countDaysTogether(
            "09-01",
            "10-19",
            "06-19",
            "10-20"
        )

        assertEquals(
            49,
            actual
        )
    }

}