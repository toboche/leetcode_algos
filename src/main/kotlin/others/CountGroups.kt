package others
//3, 7 fialing
class CountGroups {
    fun countGroups(related: Array<String>): Int {
        // Write your code here
        val gifted = related.map {
            println(it)
            it.toCharArray() }
        var count = 0
        for (i in gifted.indices) {
            for (j in gifted.indices) {
                if (gifted[i][j] == '0') {
                    continue
                }
                count += 1
                dfs(i, j, gifted)
            }
        }
        return count
    }

    fun dfs(i: Int, j: Int, gifted: List<CharArray>) {
        if (i < 0 || j < 0 || i > gifted.size || j > gifted.size || gifted[i][j] == '0') {
            return
        } else {
            gifted[i][j] = '0'
            gifted[j][i] = '0'
            gifted[i].withIndex()
                .filter { (index, c) -> c == '1' }
                .forEach {(index, c) ->
                    for (rec in gifted.indices)
                        dfs(index, rec, gifted)
                }
        }
    }
}