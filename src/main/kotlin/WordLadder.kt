class WordLadder {

    class Node(
        val value: String,
        var adj: List<Node>
    )

    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val mappings = mutableMapOf<String, Node>()
        val extendedWordList = wordList + beginWord
        extendedWordList.forEach {
            mappings.put(it, Node(value = it, adj = emptyList()))
        }
        extendedWordList.forEach { currentWord ->
            val currentNode = mappings[currentWord]!!
            val adj = wordList.filter { word ->
                word.withIndex().count { (index, wordChar) ->
                    wordChar != currentWord[index]
                } == 1
            }.map { validTransformation ->
                mappings[validTransformation]!!
            }
            currentNode.adj = adj
        }

        val queue = ArrayDeque<Pair<Node, Int>>()
        queue.add(mappings[extendedWordList.last()]!! to 1)
        val visited = mutableSetOf<String>()
        while (queue.isNotEmpty()) {
            val (node, level) = queue.removeFirst()
            visited.add(node.value)
            if (node.value == endWord) {
                return level
            }
            queue.addAll(node.adj.filterNot { visited.contains(it.value) }.map { it to level+1 })
        }
        return 0
    }
}