class ValidateIpAddress {
    fun validIPAddress(queryIP: String): String {
        val ipV4 = queryIP.split('.')
            .map {
                if ((it.length > 1 && it.startsWith('0')))
                    null
                else
                    it.toIntOrNull()
            }
            .map { (0..255).contains(it) }

        if (ipV4.count { it } == 4 && ipV4.count() == 4) {
            return "IPv4"
        }

        val ipV6 = queryIP.split(':')
            .map {
                if (it.length > 4) {
                    null
                } else {
                    it.toIntOrNull(16)
                }
            }
            .map { (0.."ffff".toInt(16)).contains(it) }

        if (ipV6.count { it } == 8 && ipV6.count() == 8) {
            return "IPv6"
        }

        return "Neither"
    }
}