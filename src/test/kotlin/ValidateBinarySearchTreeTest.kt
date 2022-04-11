import junit.framework.Assert.assertFalse
import org.junit.Test
import kotlin.test.assertTrue

class ValidateBinarySearchTreeTest {
    @Test
    fun test1() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(2, 1, 3)))

        assertTrue(actual)
    }

    @Test
    fun test2() {
        val actual = ValidateBinarySearchTree().isValidBST(TreeNode.from(listOf(5, 1, 4, null, null, 3, 6)))

        assertFalse(actual)
    }
}