class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        val ms = grid.size
        if (ms == 0) {
            return 0
        }
        val ns = grid[0].size
        val visited = Array(ms) { BooleanArray(ns) }
        var count = 0

        fun island(
            m: Int,
            n: Int,
            localVisited: Array<BooleanArray> = Array(ms, { BooleanArray(ns) })
        ): List<Pair<Int, Int>> {
            return if (m < 0 || n < 0) {
                emptyList()
            } else if (m >= ms || n >= ns) {
                emptyList()
            } else if (grid[m][n] == '0') {
                emptyList()
            } else if(localVisited[m][n]){
                emptyList()
            } else {
                localVisited[m][n] = true
                listOf(m to n) +
                        island(m + 1, n, localVisited) +
                        island(m - 1, n, localVisited) +
                        island(m, n + 1, localVisited) +
                        island(m, n - 1, localVisited)
            }

        }

        for (m in 0 until ms) {
            for (n in 0 until ns) {
                if (visited[m][n]) {
                    continue
                }
                val island = island(m, n)

                if (island.isEmpty()) {
                    continue
                }

                island.forEach { visited[it.first][it.second] = true }
                count += 1
            }
        }
        return count
    }
}