import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class LRUCacheWithLinkedHashMapTest {
    @Test
    fun `sample 1`() {
        val lRUCacheWithLinkedHashMap = LRUCacheWithLinkedHashMap(2)
        lRUCacheWithLinkedHashMap.put(1, 1) // cache is {1=1}

        lRUCacheWithLinkedHashMap.put(2, 2) // cache is {1=1, 2=2}

        assertThat(lRUCacheWithLinkedHashMap.get(1)).isEqualTo(1) // return 1

        lRUCacheWithLinkedHashMap.put(3, 3) // LRU key was 2, evicts key 2, cache is {1=1, 3=3}

        assertThat(lRUCacheWithLinkedHashMap.get(2))
            .isEqualTo(-1)// returns -1 (not found)

        lRUCacheWithLinkedHashMap.put(4, 4) // LRU key was 1, evicts key 1, cache is {4=4, 3=3}

        assertThat(lRUCacheWithLinkedHashMap.get(1))
            .isEqualTo(-1)// return -1 (not found)

        assertThat(lRUCacheWithLinkedHashMap.get(3))
            .isEqualTo(3)// return 3

        assertThat(lRUCacheWithLinkedHashMap.get(4))
            .isEqualTo(4)// return 4

    }
}