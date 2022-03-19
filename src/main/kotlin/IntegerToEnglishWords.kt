class IntegerToEnglishWords {
    val digits = listOf(
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
    val elevenToNineteen = listOf(
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

    val tens = listOf(
        null,
        "Ten",
        "Twenty",
        "Thirty",
        "Fourty",
        "Fifty",
        "Sixty",
        "Seventy",
        "Eighty",
        "Ninety"
    )

    fun numberToWords(num: Int): String {
        if (num == 0) {
            return "Zero"
        }
        val tens = if ((20..99).contains(num % 100)) {
            tens[num / 10]
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