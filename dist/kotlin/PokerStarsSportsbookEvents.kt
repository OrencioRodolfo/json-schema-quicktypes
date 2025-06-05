// To parse the JSON, install Klaxon and do:
//
//   val betCashoutEvent = BetCashoutEvent.fromJson(jsonString)
//   val betPlacementEvent = BetPlacementEvent.fromJson(jsonString)

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
    .convert(Kind::class,                  { Kind.fromValue(it.string!!) },                  { "\"${it.value}\"" })
    .convert(BetCashoutEventType::class,   { BetCashoutEventType.fromValue(it.string!!) },   { "\"${it.value}\"" })
    .convert(Origin::class,                { Origin.fromValue(it.string!!) },                { "\"${it.value}\"" })
    .convert(BetPlacementEventType::class, { BetPlacementEventType.fromValue(it.string!!) }, { "\"${it.value}\"" })

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class BetCashoutEvent (
    /**
     * Identifies this message as an Event
     */
    val kind: Kind? = null,

    val payload: BetCashoutEventPayload,
    val type: BetCashoutEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<BetCashoutEvent>(json)
    }
}

enum class Kind(val value: String) {
    Event("event");

    companion object {
        public fun fromValue(value: String): Kind = when (value) {
            "event" -> Event
            else    -> throw IllegalArgumentException()
        }
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
    SportsbookBetCashout("@@sportsbook/bet_cashout");

    companion object {
        public fun fromValue(value: String): BetCashoutEventType = when (value) {
            "@@sportsbook/bet_cashout" -> SportsbookBetCashout
            else                       -> throw IllegalArgumentException()
        }
    }
}

/**
 * Triggered when a user places a bet successfuly
 */
data class BetPlacementEvent (
    /**
     * Identifies this message as an Event
     */
    val kind: Kind,

    val meta: Meta? = null,
    val payload: BetPlacementEventPayload,

    /**
     * Defines the UID for this event
     */
    val type: BetPlacementEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<BetPlacementEvent>(json)
    }
}

data class Meta (
    val origin: Origin? = null
)

enum class Origin(val value: String) {
    Sportsbook("sportsbook");

    companion object {
        public fun fromValue(value: String): Origin = when (value) {
            "sportsbook" -> Sportsbook
            else         -> throw IllegalArgumentException()
        }
    }
}

data class BetPlacementEventPayload (
    @Json(name = "betId")
    val betID: Double,

    val betPlacedTime: String? = null,

    @Json(name = "betReceiptId")
    val betReceiptID: String,

    val totalPotentialWin: Double? = null,
    val totalStake: Double? = null
)

enum class BetPlacementEventType(val value: String) {
    SportsbookBetPlaced("@@sportsbook/bet_placed");

    companion object {
        public fun fromValue(value: String): BetPlacementEventType = when (value) {
            "@@sportsbook/bet_placed" -> SportsbookBetPlaced
            else                      -> throw IllegalArgumentException()
        }
    }
}
