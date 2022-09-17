package leetcode_contests

import java.time.Period
import java.time.ZoneId
import java.time.temporal.ChronoUnit
import java.util.*

class CountDaysSpentTogether {
    fun countDaysTogether(arriveAlice: String, leaveAlice: String, arriveBob: String, leaveBob: String): Int {
        val aa = map(arriveAlice)
        val al = map(leaveAlice)
        val ba = map(arriveBob)
        val bl = map(leaveBob)
        val start = if (aa.isBefore(ba)) {
            ba
        } else {
            aa
        }
        val end = if (al.isBefore(bl)) {
            al
        } else {
            bl
        }.plusDays(1)
        return ChronoUnit.DAYS.between(start, end).toInt().let {
            Math.max(it, 0)
        }
    }

    private fun map(arriveAlice: String) = arriveAlice.split("-").map { it.toInt() }.let {
        Date(2022-1900, it[0]-1, it[1]).toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    }
}