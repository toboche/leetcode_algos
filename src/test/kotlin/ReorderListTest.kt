import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class ReorderListTest(
    val input: ListNode?,
    val expected: ListNode?
) {

    companion object {
        @Parameterized.Parameters
        @JvmStatic
        fun primeNumbers(): Collection<*> {
            return listOf(
                arrayOf<Any>(listOf(1, 2, 3, 4), listOf(1, 4, 2, 3)),
                arrayOf<Any>(listOf(1, 2, 3, 4, 5), listOf(1, 5, 2, 4, 3)),
            )
        }
    }


    @Test
    fun `reorder sample`() {
        ReorderList().reorderList(input)

        assertEquals(
            expected,
            input
        )
    }
}