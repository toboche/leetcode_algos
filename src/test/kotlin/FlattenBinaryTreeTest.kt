import org.junit.Assert.assertEquals
import org.junit.Test

class FlattenBinaryTreeTest {
    @Test
    fun `test null not crashes`() {
        FlattenBinaryTree().flatten(null)
    }

    @Test
    fun `test single item`() {
        val root = TreeNode(1)

        FlattenBinaryTree().flatten(root)

        assertEquals(TreeNode(1), root)
    }

//    @Test
//    fun `test regular case`() {
//        val root = TreeNode.from(listOf(1, 2, 5, 3, 4, null, 6))
//
//        FlattenBinaryTree().flatten(root)
//
//        assertEquals(
//            TreeNode.from(listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6)),
//            root
//        )
//    }
//
//    @Test
//    fun `test regular case faster`() {
//        val root = TreeNode.from(listOf(1, 2, 5, 3, 4, null, 6))
//
//        FlattenBinaryTree().flattenFaster(root)
//
//        assertEquals(
//            TreeNode.from(listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6)),
//            root
//        )
//    }
}