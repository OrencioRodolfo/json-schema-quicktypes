// To parse the JSON, install Klaxon and do:
//
//   val sBKEventsBetCashedOutEvent = SBKEventsBetCashedOutEvent.fromJson(jsonString)
//   val sBKEventsBetPlacedEvent = SBKEventsBetPlacedEvent.fromJson(jsonString)

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
    .convert(Kind::class,                           { Kind.fromValue(it.string!!) },                           { "\"${it.value}\"" })
    .convert(Origin::class,                         { Origin.fromValue(it.string!!) },                         { "\"${it.value}\"" })
    .convert(SBKEventsBetCashedOutEventType::class, { SBKEventsBetCashedOutEventType.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(SBKEventsBetPlacedEventType::class,    { SBKEventsBetPlacedEventType.fromValue(it.string!!) },    { "\"${it.value}\"" })

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class SBKEventsBetCashedOutEvent (
    val kind: Kind,
    val meta: SBKEventsBetCashedOutEventMeta,
    val payload: SBKEventsBetCashedOutEventPayload,

    /**
     * Defines the UID for this event
     */
    val type: SBKEventsBetCashedOutEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<SBKEventsBetCashedOutEvent>(json)
    }
}

/**
 * Identifies the message as being an Event
 */
enum class Kind(val value: String) {
    Event("event");

    companion object {
        public fun fromValue(value: String): Kind = when (value) {
            "event" -> Event
            else    -> throw IllegalArgumentException()
        }
    }
}

data class SBKEventsBetCashedOutEventMeta (
    val origin: Origin? = null
)

/**
 * Identifies 'Sportsbook' as the origin
 */
enum class Origin(val value: String) {
    Sportsbook("sportsbook");

    companion object {
        public fun fromValue(value: String): Origin = when (value) {
            "sportsbook" -> Sportsbook
            else         -> throw IllegalArgumentException()
        }
    }
}

data class SBKEventsBetCashedOutEventPayload (
    val betDelay: Double? = null,

    @Json(name = "betId")
    val betID: String,

    val cashedOutQuote: Double,
    val cashOutToken: String? = null,
    val quote: Double? = null
)

enum class SBKEventsBetCashedOutEventType(val value: String) {
    SportsbookBetCashedOut("@@sportsbook/bet_cashed_out");

    companion object {
        public fun fromValue(value: String): SBKEventsBetCashedOutEventType = when (value) {
            "@@sportsbook/bet_cashed_out" -> SportsbookBetCashedOut
            else                          -> throw IllegalArgumentException()
        }
    }
}

/**
 * Triggered when a user places a bet successfuly
 */
data class SBKEventsBetPlacedEvent (
    val kind: Kind,
    val meta: SBKEventsBetPlacedEventMeta,
    val payload: SBKEventsBetPlacedEventPayload,

    /**
     * Defines the UID for this event
     */
    val type: SBKEventsBetPlacedEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<SBKEventsBetPlacedEvent>(json)
    }
}

data class SBKEventsBetPlacedEventMeta (
    val origin: Origin? = null
)

data class SBKEventsBetPlacedEventPayload (
    @Json(name = "betId")
    val betID: Double,

    val betPlacedTime: String? = null,

    @Json(name = "betReceiptId")
    val betReceiptID: String,

    val totalPotentialWin: Double? = null,
    val totalStake: Double? = null
)

enum class SBKEventsBetPlacedEventType(val value: String) {
    SportsbookBetPlaced("@@sportsbook/bet_placed");

    companion object {
        public fun fromValue(value: String): SBKEventsBetPlacedEventType = when (value) {
            "@@sportsbook/bet_placed" -> SportsbookBetPlaced
            else                      -> throw IllegalArgumentException()
        }
    }
}
