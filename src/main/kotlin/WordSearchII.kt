class WordSearchII {
    class TrieNode(
        val char: Char,
        val charArray: Array<TrieNode?> = Array<TrieNode?>('z' - 'a' + 1) { null },
        var word: String? = null
    )

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        val ns = board.size
        if (ns == 0) {
            return emptyList()
        }
        val ms = board[0].size

        val trie = TrieNode(
            ' '
        )

        for (word in words) {
            var currentNode = trie
            word.forEach { char ->
                if (currentNode.charArray[char - 'a'] == null) {
                    currentNode.charArray[char - 'a'] = TrieNode(char)
                }
                currentNode = currentNode.charArray[char - 'a']!!
            }
            currentNode.word = word
        }


        val visited = Array(ns) { BooleanArray(ms) { false } }
        val found = mutableSetOf<String>()

        fun visit(
            currentNode: TrieNode,
            n: Int,
            m: Int,
            visitedFromRoot: Boolean = false,
            pathToHere: List<Pair<Int, Int>>
        ) {
            if (n < 0 || m < 0 || n >= ns || m >= ms) return
            if (visited[n][m] && visitedFromRoot) {
                return
            }
            if (visitedFromRoot) {
                visited[n][m] = true
            }

            val char = board[n][m]
            val nextNode = currentNode.charArray[char - 'a']
            if (nextNode != null && !pathToHere.contains(n to m)) {
                if (nextNode.word != null) {
                    found.add(nextNode.word!!)
                }
                visit(nextNode, n - 1, m, visitedFromRoot = false, pathToHere = pathToHere + (n to m))
                visit(nextNode, n + 1, m, pathToHere = pathToHere + (n to m))
                visit(nextNode, n, m - 1, pathToHere = pathToHere + (n to m))
                visit(nextNode, n, m + 1, pathToHere = pathToHere + (n to m))
            }
            visit(trie, n - 1, m, true, listOf())
            visit(trie, n + 1, m, true, listOf())
            visit(trie, n, m - 1, true, listOf())
            visit(trie, n, m + 1, true, listOf())
        }
        visit(trie, 0, 0, true, listOf())
        return found.toList()
    }
}