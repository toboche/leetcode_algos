package hackerrank

import java.math.BigDecimal
import java.math.MathContext

class PlusMinus {
    fun plusMinus(arr: Array<Int>): Unit {
        var posCount = 0
        var negCount = 0
        var zerosCount = 0
        arr.forEach {
            if (it > 0) posCount++
            else if (it < 0) negCount++
            else zerosCount++
        }
        val count = arr.size.toBigDecimal()
        println(toStringDivided(posCount, count))
        println(toStringDivided(negCount, count))
        println(toStringDivided(zerosCount, count))
    }

    private fun toStringDivided(posCount: Int, count: BigDecimal) =
        if (count == BigDecimal.ZERO) {
            ""
        } else {
            String.format("%.6f", posCount.toBigDecimal().divide(count, MathContext(6)))
        }

    fun main(args: Array<String>) {
        val n = readLine()!!.trim().toInt()

        val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        plusMinus(arr)
    }

}