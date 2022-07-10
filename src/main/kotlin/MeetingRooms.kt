class MeetingRooms {
    fun minMeetingRooms(intervals: Array<IntArray>): Int {
        val sorted = intervals.sortedBy { it[0] }
        var currentCount = 0
        var max = 0
        var currentMeetings = mutableListOf<IntArray>()

        for (currentMeeting in sorted) {
            val (left, right) = currentMeeting
            currentMeetings = currentMeetings.filter {
                it[1] > left
            }.toMutableList()
            currentMeetings.add(currentMeeting)
            max = Math.max(max, currentMeetings.count())
        }

        return max
    }
}