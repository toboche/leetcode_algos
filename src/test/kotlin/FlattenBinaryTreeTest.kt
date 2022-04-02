import org.junit.Assert.*
import org.junit.Test

class FlattenBinaryTreeTest {
    @Test
    fun `test null not crashes`() {
        FlattenBinaryTree().flatten(null)
    }
}