import org.junit.Test
import kotlin.test.assertEquals

internal class MergeTwoSortedListsTest {
    @Test
    fun `merge simple lists`() {
        val actual = MergeTwoSortedLists().mergeTwoLists(
            ListNode.fromItems(listOf(1, 2, 4)),
            ListNode.fromItems(listOf(1, 3, 4))
        )

        assertEquals(
            ListNode.fromItems(
                listOf(1, 1, 2, 3, 4, 4),
            ),
            actual
        )
    }
}