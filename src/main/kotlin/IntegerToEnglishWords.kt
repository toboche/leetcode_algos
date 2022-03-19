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
        val thousands = if ((1..999).contains(num % 1000)) {
            upToThousand(num % 1000)
        } else {
            null
        }
        val millions = if ((1000..999999).contains(num % 1000000)) upToThousand(num % 1000000/1000) + " Thousand" else {
            null
        }
        return listOf(
            millions,
            thousands
        ).fold("") { acc, it ->
            if (it.isNullOrBlank()) acc else "$acc $it"
        }
            .trim()
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