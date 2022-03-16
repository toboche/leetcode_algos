class ValidateIpAddress {
    fun validIPAddress(queryIP: String): String {
        val ipV4 = queryIP.split('.')
            .map { it.toIntOrNull() }
            .map { (0..255).contains(it) }

        if (ipV4.count() == 4) {
            return "IPv4"
        }
        return "Neither"
    }
}