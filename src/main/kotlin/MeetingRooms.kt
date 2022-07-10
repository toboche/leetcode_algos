import java.util.*

class MeetingRooms {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        val sorted = intervals.sortedBy { it[0] }
        var max = 0
        val currentMeetings = PriorityQueue<IntArray>(object : Comparator<IntArray> {
            override fun compare(o1: IntArray, o2: IntArray): Int {
                return o1[1] - o2[1]
            }
        })

        for (currentMeeting in sorted) {
            val (left, right) = currentMeeting
            while (currentMeetings.peek() != null && currentMeetings.peek()[1] <= left) {
                currentMeetings.remove()
            }
            currentMeetings.add(currentMeeting)
            max = Math.max(max, currentMeetings.count())
        }

        return max
    }
}