class ThreeNumberSum {
    fun threeNumberSum(array: MutableList<Int>, targetSum: Int): List<List<Int>> {
        val sorted = array.sorted()
        val toSet = array.toMutableSet()
        val toReturn = mutableListOf<List<Int>>()
        for(i in sorted.indices){
            val ith = sorted[i]
            toSet.remove(ith)
            for (j in i+1 until sorted.size){
                val jth = sorted[j]
                val missing = targetSum - ith - jth
                if(missing <= jth){
                    continue
                }
                if(toSet.contains(missing)){
                    toReturn.add(listOf(ith, jth, missing))
                }
            }
        }

        return toReturn
    }

}