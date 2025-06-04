// To parse the JSON, install Klaxon and do:
//
//   val betPlacementEvent = BetPlacementEvent.fromJson(jsonString)
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
    .convert(BetPlacementEventType::class, { BetPlacementEventType.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(BetCashoutEventType::class,   { BetCashoutEventType.fromValue(it.string!!) },   { "\"${it.value}\"" })

/**
 * Triggered when a user places a bet
 */
data class BetPlacementEvent (
    val payload: BetPlacementEventPayload,
    val type: BetPlacementEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<BetPlacementEvent>(json)
    }
}

data class BetPlacementEventPayload (
    @Json(name = "betId")
    val betID: Double,

    val betPlacedTime: String,

    @Json(name = "betReceiptId")
    val betReceiptID: String,

    val totalPotentialWin: Double,
    val totalStake: Double
)

enum class BetPlacementEventType(val value: String) {
    SportsBetPlacement("@@sports/bet_placement");

    companion object {
        public fun fromValue(value: String): BetPlacementEventType = when (value) {
            "@@sports/bet_placement" -> SportsBetPlacement
            else                     -> throw IllegalArgumentException()
        }
    }
}

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class BetCashoutEvent (
    val payload: BetCashoutEventPayload,
    val type: BetCashoutEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<BetCashoutEvent>(json)
    }
}

data class BetCashoutEventPayload (
    val betDelay: Double? = null,

    @Json(name = "betId")
    val betID: String,

    val cashedOutQuote: Double,
    val cashOutToken: String? = null,
    val quote: Double? = null
)

enum class BetCashoutEventType(val value: String) {
    SportsBetCashout("@@sports/bet_cashout");

    companion object {
        public fun fromValue(value: String): BetCashoutEventType = when (value) {
            "@@sports/bet_cashout" -> SportsBetCashout
            else                   -> throw IllegalArgumentException()
        }
    }
}
