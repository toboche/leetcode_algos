package others

class HeaviestPackage {
    fun getHeaviestPackage(packageWeights: Array<Int>): Long {
        println(packageWeights.joinToString(", "))
        var pair: Pair<Int, Int>? = null
        var starting = true
        var input = packageWeights.map { it.toLong() }.toMutableList()
        while (starting || pair != null) {
            starting = false
            pair = null
            var curMax = Long.MIN_VALUE
            input.withIndex().windowed(2, 1, false)
                .forEach { (f, s) ->
                    if (f.value < s.value) {
                        if (f.value.toLong() + s.value.toLong() >= curMax) {
                            curMax = f.value.toLong() + s.value.toLong()
                            pair = f.index to s.index
                        }
                    }
                }

            if (pair != null) {
                val f = input[pair!!.first]
                val s = input[pair!!.second]
                input.removeAt(pair!!.second)
                input[pair!!.first] = f + s
            }
        }
        return input.maxOrNull() ?: 0
    }
}