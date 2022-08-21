package others

import org.junit.Assert.assertEquals
import org.junit.Test

class MaxFreqDeviationTest {
    @Test
    fun `test 1`() {
        val actual = MaxFreqDeviation().getMaxFreqDeviation("aabb")
        assertEquals(
            1,
            actual
        )
    }

    @Test
    fun `test 2`() {
        val actual = MaxFreqDeviation().getMaxFreqDeviation("bbacccabab")
        assertEquals(
            2,
            actual
        )
    }

    @Test
    fun `test 3`() {
        val actual = MaxFreqDeviation().getMaxFreqDeviation("aaaaa")
        assertEquals(
            0,
            actual
        )
    }

}