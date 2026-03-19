fun twofer(name: String? = null): String {
    name?.let {require( it.all {it.isLetter() } ) {
        "Expected: The name should only contain characters.\n Actual: The name received is $it"
    }}
    return "One for ${name?.replaceFirstChar {it.uppercase()} ?: "you"}, one for me."
}
