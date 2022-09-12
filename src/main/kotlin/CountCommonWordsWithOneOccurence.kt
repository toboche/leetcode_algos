class CountCommonWordsWithOneOccurence {
    fun countWords(words1: Array<String>, words2: Array<String>): Int {
        val map1 = mutableMapOf<String, Boolean>()
        val map2 = mutableMapOf<String, Boolean>()

        words1.forEach { w1 ->
            map1[w1] = map1[w1] == null
        }
        words2.forEach { w2 ->
            map2[w2] = map2[w2] == null
        }
        return map1.filter { (key, value) ->
            value && (map2[key] ?: false)
        }
            .count()
    }
}