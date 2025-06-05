// To parse the JSON, install Klaxon and do:
//
//   val betCashoutEvent = BetCashoutEvent.fromJson(jsonString)

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
    .convert(Kind::class, { Kind.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(Type::class, { Type.fromValue(it.string!!) }, { "\"${it.value}\"" })

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class BetCashoutEvent (
    /**
     * Identifies this message as a Command
     */
    val kind: Kind? = null,

    val payload: Payload,
    val type: Type
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<BetCashoutEvent>(json)
    }
}

enum class Kind(val value: String) {
    Command("command");

    companion object {
        public fun fromValue(value: String): Kind = when (value) {
            "command" -> Command
            else      -> throw IllegalArgumentException()
        }
    }
}

data class Payload (
    val betDelay: Double? = null,

    @Json(name = "betId")
    val betID: String,

    val cashedOutQuote: Double,
    val cashOutToken: String? = null,
    val quote: Double? = null
)

enum class Type(val value: String) {
    SportsbookBetCashout("@@sportsbook/bet_cashout");

    companion object {
        public fun fromValue(value: String): Type = when (value) {
            "@@sportsbook/bet_cashout" -> SportsbookBetCashout
            else                       -> throw IllegalArgumentException()
        }
    }
}
