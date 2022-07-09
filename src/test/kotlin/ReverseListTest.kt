import org.junit.Test
import kotlin.test.assertEquals

class ReverseListTest {
    @Test
    fun `test 1`() {
        val actual = ReverseList().reverseList(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))

        assertEquals(
            ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1))))),
            actual
        )
    }
}