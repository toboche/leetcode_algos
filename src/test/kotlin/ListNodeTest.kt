import org.junit.Test
import kotlin.test.assertEquals

internal class ListNodeTest {
    @Test
    fun `create list`() {
        val actual = ListNode.fromItems(listOf(1, 2, 3))

        assertEquals(
            ListNode(1, ListNode(2, ListNode(3, null))),
            actual
        )
    }
}