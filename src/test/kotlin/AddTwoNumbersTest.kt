import org.junit.Test
import kotlin.test.assertEquals

internal class AddTwoNumbersTest {
    @Test
    fun test1() {
        val a = ListNode(2, ListNode(4, ListNode(3, null)))
        val b = ListNode(5, ListNode(6, ListNode(4, null)))
        val addTwoNumbers = AddTwoNumbers().addTwoNumbers(a, b)

        assertEquals(
            ListNode(7, ListNode(0, ListNode(8, null))),
            addTwoNumbers
        )
    }
}