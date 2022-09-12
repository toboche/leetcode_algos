import java.lang.Math.*
import java.util.*

class MinimumSumOfSquaredDifference {
    fun minSumSquareDiff(nums1: IntArray, nums2: IntArray, k1: Int, k2: Int): Long {
        val map = nums1.indices.map {
           -abs( nums1[it].toLong() - nums2[it].toLong())
        }

        if (k1.toLong() + k2.toLong() >= -map.sum()) {
            return 0
        }

        val pq = PriorityQueue<Long>()
        pq.addAll(map)
        var cur = k1.toLong() + k2.toLong()
        while (pq.isNotEmpty() && cur > 0) {
            val polled = pq.poll()
            if (polled == 0L) {
                return pq.map { (it).toBigInteger().pow(2) }.map { it.toLong() }.sum()
            }
            val cut = max(min(cur,  polled - pq.peek() ),1)
            val new =
                pq.add(polled + cut)
            cur -= cut

        }
        return pq.map { (it).toBigInteger().pow(2) }.map { it.toLong() }.sum()
    }
}