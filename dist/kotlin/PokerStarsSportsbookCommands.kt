// To parse the JSON, install Klaxon and do:
//
//   val pokerStarsSportsbookCommands = PokerStarsSportsbookCommands.fromJson(jsonString)

package quicktype

import com.beust.klaxon.*

private fun <T> Klaxon.convert(k: kotlin.reflect.KClass<*>, fromJson: (JsonValue) -> T, toJson: (T) -> String, isUnion: Boolean = false) =
    this.converter(object: Converter {
        @Suppress("UNCHECKED_CAST")
        override fun toJson(value: Any)        = toJson(value as T)
        override fun fromJson(jv: JsonValue)   = fromJson(jv) as Any
        override fun canConvert(cls: Class<*>) = cls == k.java || (isUnion && cls.superclass == k.java)
    })

private val klaxon = Klaxon()
    .convert(Type::class, { Type.fromValue(it.string!!) }, { "\"${it.value}\"" })

/**
 * Triggered when user taps 'Login to place bet' CTA in Betslip
 */
data class PokerStarsSportsbookCommands (
    val payload: Payload,
    val type: Type
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<PokerStarsSportsbookCommands>(json)
    }
}

data class Payload (
    @Json(name = "betId")
    val betID: Double,

    val betPlacedTime: String,

    @Json(name = "betReceiptId")
    val betReceiptID: String,

    val totalPotentialWin: Double,
    val totalStake: Double
)

enum class Type(val value: String) {
    SportsBetPlacement("@@sports/bet_placement");

    companion object {
        public fun fromValue(value: String): Type = when (value) {
            "@@sports/bet_placement" -> SportsBetPlacement
            else                     -> throw IllegalArgumentException()
        }
    }
}
