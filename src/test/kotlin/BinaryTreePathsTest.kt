import org.junit.Assert.assertEquals
import org.junit.Test

class BinaryTreePathsTest {
    @Test
    fun `sample 1`() {
        val actual = BinaryTreePaths().binaryTreePaths(TreeNode.from(listOf(1, 2, 3, null, 5)))

        assertEquals(
            listOf("1->2->5", "1->3"),
            actual
        )
    }

    @Test
    fun `sample 2`() {
        val actual = BinaryTreePaths().binaryTreePaths(null)

        assertEquals(
            listOf<String>(),
            actual
        )
    }
}