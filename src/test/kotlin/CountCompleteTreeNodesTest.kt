import org.junit.Assert.assertEquals
import org.junit.Test

class CountCompleteTreeNodesTest {
    @Test
    fun `test 2`() {
        val actual = CountCompleteTreeNodes().countNodes(
            TreeNode.from(
                listOf(1, 2)
            )
        )
        assertEquals(
            2,
            actual
        )
    }
    @Test
    fun `test 1`() {
        val actual = CountCompleteTreeNodes().countNodes(
            TreeNode.from(
                listOf(1,2,3,4,5,6)
            )
        )
        assertEquals(
            6,
            actual
        )
    }

}