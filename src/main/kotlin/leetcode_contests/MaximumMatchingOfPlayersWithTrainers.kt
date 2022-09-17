package leetcode_contests

class MaximumMatchingOfPlayersWithTrainers {
    fun matchPlayersAndTrainers(players: IntArray, trainers: IntArray): Int {
        val ps = players.sortedArray()
        val ts = trainers.sortedArray()
        var cnt = 0

        var prevT = -1
        for (i in ps.indices) {
            val p = ps[i]
            var curT = prevT + 1
            var found = false
            while (ts.size > curT) {
                if (p <= ts[curT]) {
                    cnt += 1
                    found = true
                    prevT = curT
                    curT += 1
                    break
                }
                curT += 1
            }
            if (!found) {
                return cnt
            }
        }
        return cnt
    }
}