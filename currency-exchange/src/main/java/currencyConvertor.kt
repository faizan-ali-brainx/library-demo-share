
fun convertCurrency(pkrTo: Double, toCurrency: String): Double? {
    return when (toCurrency) {
        "usd" -> pkrTo * 2
        "inr" -> pkrTo * 1.5
        "eur" -> pkrTo * 3
        "gbp" -> pkrTo * 2.5
        else -> {
            null
        }
    }
}