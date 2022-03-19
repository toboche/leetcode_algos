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

    fun numberToWords(num: Int): String {
        return digits[num % 10]
    }
}