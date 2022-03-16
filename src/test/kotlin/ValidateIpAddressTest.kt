import org.junit.Assert.assertEquals
import org.junit.Test

class ValidateIpAddressTest {
    @Test
    fun testIpV4() {
        val actual = ValidateIpAddress().validIPAddress("172.16.254.1")

        assertEquals("IPv4", actual)
    }

    @Test
    fun testIpV4NotPassing() {
        val actual = ValidateIpAddress().validIPAddress("172.16.254.1.1")

        assertEquals("Neither", actual)
    }

    @Test
    fun testIpV4NotPassing2() {
        val actual = ValidateIpAddress().validIPAddress("172.16.254..1")

        assertEquals("Neither", actual)
    }

    @Test
    fun testIpv6() {
        val actual = ValidateIpAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334")

        assertEquals("IPv6", actual)
    }

    @Test
    fun testNeither() {
        val actual = ValidateIpAddress().validIPAddress("256.256.256.256")

        assertEquals("Neither", actual)
    }
}