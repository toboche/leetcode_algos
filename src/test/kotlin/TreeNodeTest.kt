import org.junit.Test
import kotlin.test.assertEquals

class TreeNodeTest {
    @Test
    fun `null input`() {
        val actual = TreeNode.from(listOf(null))

        assertEquals(null, actual)
    }

    @Test
    fun `single item`() {
        val actual = TreeNode.from(listOf(1))

        assertEquals(TreeNode(1), actual)
    }

    @Test
    fun `two items`() {
        val actual = TreeNode.from(listOf(1, 2))

        assertEquals(TreeNode(1, TreeNode(2)), actual)
    }

    @Test
    fun `seven items`() {
        val actual = TreeNode.from(listOf(1, 2, 5, 3, 4, null, 6))

        assertEquals(TreeNode(1, TreeNode(2, TreeNode(3), TreeNode(4)), TreeNode(5, null, TreeNode(6))), actual)
    }

//    @Test
//    fun `seven items on the right`() {
//        val actual = TreeNode.from(listOf(1, null, 2, null, 3, null, 4, null, 5, null, 6))
//
//        assertEquals(
//            TreeNode(
//                1,
//                null,
//                TreeNode(
//                    2, null,
//                    TreeNode(
//                        3, null,
//                        TreeNode(
//                            4, null,
//                            TreeNode(
//                                5, null,
//                                TreeNode(6)
//                            )
//                        )
//                    )
//                )
//            ), actual
//        )
//    }
}