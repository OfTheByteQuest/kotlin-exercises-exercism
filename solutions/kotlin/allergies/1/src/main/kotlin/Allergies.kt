// enum class Allergen(val score: Int){
//     EGGS(1),
//     PEANUTS(2),
//     SHELLFISH(4),
//     STRAWBERRIES(8),
//     TOMATOES(16),
//     CHOCOLATE(32),
//     POLLEN(64),
//     CATS(128)
// }

class Allergies (private val allergyScore: Int) {
    init {
        require(allergyScore >= 0) {
            "Expected: Positive allergy score.\n Actual: Allery score received is $allergyScore"
        }
    }

    fun getList(): List<Allergen> {
        return Allergen.entries.filter { isAllergicTo (it)}    
    }

    fun isAllergicTo(allergen: Allergen): Boolean {
        
        val allergyMask = 1 shl allergen.ordinal
        
        return (allergyScore and allergen.score) != 0
    }
}
