import ListNode.Companion.fromItems
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import kotlin.test.assertEquals

@RunWith(Parameterized::class)
internal class MergeTwoSortedListsTest(
    val first: List<Int>,
    val second: List<Int>,
    val expected: List<Int>,
) {

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun primeNumbers(): Collection<*> {
            return listOf(
                arrayOf<Any>(listOf(1, 2, 4), listOf(1, 3, 4), listOf(1, 1, 2, 3, 4, 4)),
                arrayOf<Any>(listOf<Int>(), listOf<Int>(), listOf<Int>()),
                arrayOf<Any>(listOf(1), listOf<Int>(), listOf(1)),
                arrayOf<Any>(listOf<Int>(), listOf(2), listOf(2)),
                arrayOf<Any>(listOf<Int>(), listOf(2, 3, 4), listOf(2, 3, 4)),
            )
        }
    }


    @Test
    fun `merge simple lists`() {
        val actual = MergeTwoSortedLists().mergeTwoLists(
            fromItems(first),
            fromItems(second)
        )

        assertEquals(
            fromItems(expected),
            actual
        )
    }
}