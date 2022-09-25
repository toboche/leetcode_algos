class ArrayOfProducts {
    fun arrayOfProducts(array: List<Int>): List<Int> {
        var zeroesCount = 0
        var nonZeroTotal = 1
        val total = array.fold(1) { acc, it ->
            if (it == 0) zeroesCount += 1
            else nonZeroTotal *= it
            acc * it
        }

        return array.map {
            if (it == 0 && zeroesCount == 1) nonZeroTotal
            else if (it == 0) total
            else total / it
        }
    }
}