class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {
        val ms = grid.size
        if (ms == 0) {
            return 0
        }
        val ns = grid[0].size
        var count = 0

        fun island(
            m: Int,
            n: Int
        ): List<Pair<Int, Int>> {
            return if (m < 0 || n < 0) {
                emptyList()
            } else if (m >= ms || n >= ns) {
                emptyList()
            } else if (grid[m][n] == '0') {
                emptyList()
            } else {
                grid[m][n] = '0'
                listOf(m to n) +
                        island(m + 1, n) +
                        island(m - 1, n) +
                        island(m, n + 1) +
                        island(m, n - 1)
            }

        }

        for (m in 0 until ms) {
            for (n in 0 until ns) {
                if (grid[m][n] == '0') {
                    continue
                }
                val island = island(m, n)

                if (island.isEmpty()) {
                    continue
                }
                count += 1
            }
        }
        return count
    }
}