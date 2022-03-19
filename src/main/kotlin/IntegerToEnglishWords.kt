import java.math.BigInteger

class IntegerToEnglishWords {
    private val digits = listOf(
        null,
        "One",
        "Two",
        "Three",
        "Four",
        "Five",
        "Six",
        "Seven",
        "Eight",
        "Nine"
    )
    private val elevenToNineteen = listOf(
        "Eleven",
        "Twelve",
        "Thirteen",
        "Fourteen",
        "Fifteen",
        "Sixteen",
        "Seventeen",
        "Eighteen",
        "Nineteen"
    )

    private val tens = listOf(
        null,
        "Ten",
        "Twenty",
        "Thirty",
        "Forty",
        "Fifty",
        "Sixty",
        "Seventy",
        "Eighty",
        "Ninety"
    )

    data class ValueRange(val name: String?, val zeros: Int)

    private val ranges = listOf(
        ValueRange("Million", 6),
        ValueRange("Thousand", 3),
        ValueRange(null, 0),
    )

    fun numberToWords(num: Int): String {
        if (num == 0) {
            return "Zero"
        }
        return ranges.map { calculateForRange(num.toBigInteger(), it) }
            .fold("") { acc, it ->
                if (it.isNullOrBlank()) acc else "$acc $it"
            }
            .trim()
    }

    private fun calculateForRange(num: BigInteger, valueRange: ValueRange) =
        if (((10.toBigInteger().pow(valueRange.zeros))..10.toBigInteger()
                .pow(valueRange.zeros + 3) - 1.toBigInteger()).contains(
                num % 10.toBigInteger()
                    .pow(valueRange.zeros + 3)
            )
        ) {
            if (valueRange.name != null) {
                upToThousand(
                    (num % 10.toBigInteger()
                        .pow(valueRange.zeros + 3) / 10.toBigInteger().pow(valueRange.zeros)).toInt()
                ) + " " + valueRange.name
            } else {
                upToThousand(
                    (num % 10.toBigInteger()
                        .pow(valueRange.zeros + 3)).toInt()
                )
            }
        } else {
            null
        }

    private fun upToThousand(num: Int): String {
        val hundreds = if ((100..999).contains(num % 1000)) {
            digits[(num / 100) % 10] + " Hundred"
        } else {
            null
        }
        val tens = if ((20..99).contains(num % 100)) {
            tens[num % 100 / 10]
        } else {
            null
        }
        val teens = if ((11..19).contains(num % 100)) {
            elevenToNineteen[num % 100 - 11]
        } else {
            null
        }
        val digit = if (!(11..19).contains(num % 100)) {
            digits[num % 10]
        } else {
            null
        }
        return listOf(
            hundreds,
            tens,
            teens,
            digit
        )
            .fold("") { acc, it ->
                if (it.isNullOrBlank()) acc else "$acc $it"
            }
            .trim()
    }
}