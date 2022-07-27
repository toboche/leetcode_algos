class WordLadder {


    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val mappings = mutableMapOf<String, MutableList<String>>()
        wordList.forEach { word ->
            word.indices.map { i ->
                word.replaceRange(i, i + 1, "*")
            }
                .forEach { transformedWord ->
                    mappings.compute(transformedWord) { _, list ->
                        (list ?: mutableListOf())
                            .apply {
                                add(word)
                            }
                    }
                }
        }

        val queue = ArrayDeque<Pair<String, Int>>()
        queue.add(beginWord to 1)
        val visited = mutableSetOf<String>()
        while (queue.isNotEmpty()) {
            val (current, level) = queue.removeFirst()
            visited.add(current)
            if (current == endWord) {
                return level
            }
            val asterisked = current.indices.map { i ->
                current.replaceRange(i, i + 1, "*")
            }
            val notVisited = asterisked.flatMap { mappings[it] ?: mutableListOf() }
                .filterNot { visited.contains(it) }
            val mappedToLevel = notVisited
                .map { it to level + 1 }
            queue.addAll(
                mappedToLevel
            )
        }
        return 0
    }
}