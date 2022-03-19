class IntegerToEnglishWords {
    val digits = listOf(
        "Zero",
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
        return listOf(
            tens[num / 10],
            digits[num % 10]
        )
            .fold("") { acc, it ->
                if (it.isNullOrBlank()) acc else "$acc $it"
            }
            .trim()
    }
}