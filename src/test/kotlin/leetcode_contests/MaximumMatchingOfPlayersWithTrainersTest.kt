package leetcode_contests

import org.junit.Assert.assertEquals
import org.junit.Test

class MaximumMatchingOfPlayersWithTrainersTest {
    @Test
    fun `test 1`() {
        val actual = MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
            players = intArrayOf(4, 7, 9), trainers = intArrayOf(8, 2, 5, 8)
        )
        assertEquals(
            2,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
            players = intArrayOf(1, 1, 1), trainers = intArrayOf(10)
        )
        assertEquals(
            1,
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = MaximumMatchingOfPlayersWithTrainers().matchPlayersAndTrainers(
            players = intArrayOf(1, 1000000000), trainers = intArrayOf(1000000000, 1)
        )
        assertEquals(
            2,
            actual
        )
    }

}