import org.junit.Assert.*
import org.junit.Test

class RemoveNthFromTheEndTest {
    @Test
    fun `sample 1`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd(
            ListNode.fromItems(listOf(1, 2, 3, 4, 5)),
            2
        )

        assertEquals(
            ListNode.fromItems(listOf(1, 2, 3, 5)),
            actualValue
        )
    }

    @Test
    fun `single element`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd(
            ListNode.fromItems(listOf(1)),
            1
        )

        assertEquals(
            null,
            actualValue
        )
    }

    @Test
    fun `no elements`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd(
            ListNode.fromItems(listOf()),
            0
        )

        assertEquals(
            null,
            actualValue
        )
    }

    @Test
    fun `one pass sample 1`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd2(
            ListNode.fromItems(listOf(1, 2, 3, 4, 5)),
            2
        )

        assertEquals(
            ListNode.fromItems(listOf(1, 2, 3, 5)),
            actualValue
        )
    }

    @Test
    fun `one pass single element`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd2(
            ListNode.fromItems(listOf(1)),
            1
        )

        assertEquals(
            null,
            actualValue
        )
    }

    @Test
    fun `one pass no elements`() {
        val actualValue = RemoveNthFromTheEnd().removeNthFromEnd2(
            ListNode.fromItems(listOf()),
            0
        )

        assertEquals(
            null,
            actualValue
        )
    }
}