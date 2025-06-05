// To parse the JSON, install Klaxon and do:
//
//   val pSEventsPerfornalDetailsUpdatedEvent = PSEventsPerfornalDetailsUpdatedEvent.fromJson(jsonString)
//   val pSEventsWalletUpdatedEvent = PSEventsWalletUpdatedEvent.fromJson(jsonString)

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
    .convert(Kind::class,                                     { Kind.fromValue(it.string!!) },                                     { "\"${it.value}\"" })
    .convert(Origin::class,                                   { Origin.fromValue(it.string!!) },                                   { "\"${it.value}\"" })
    .convert(PSEventsPerfornalDetailsUpdatedEventType::class, { PSEventsPerfornalDetailsUpdatedEventType.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(Name::class,                                     { Name.fromValue(it.string!!) },                                     { "\"${it.value}\"" })
    .convert(PSEventsWalletUpdatedEventType::class,           { PSEventsWalletUpdatedEventType.fromValue(it.string!!) },           { "\"${it.value}\"" })

/**
 * Triggered when user's personal details get changed in My Account
 */
data class PSEventsPerfornalDetailsUpdatedEvent (
    val kind: Kind,
    val meta: PSEventsPerfornalDetailsUpdatedEventMeta,
    val payload: PSEventsPerfornalDetailsUpdatedEventPayload,

    /**
     * Defines the UID for this event
     */
    val type: PSEventsPerfornalDetailsUpdatedEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<PSEventsPerfornalDetailsUpdatedEvent>(json)
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

data class PSEventsPerfornalDetailsUpdatedEventMeta (
    val origin: Origin? = null
)

/**
 * Identifies 'PokerStars' as the origin
 */
enum class Origin(val value: String) {
    Pokerstars("pokerstars");

    companion object {
        public fun fromValue(value: String): Origin = when (value) {
            "pokerstars" -> Pokerstars
            else         -> throw IllegalArgumentException()
        }
    }
}

data class PSEventsPerfornalDetailsUpdatedEventPayload (
    val language: Language? = null,
    val timezone: Timezone? = null
)

data class Language (
    val new: String? = null,
    val old: String? = null
)

data class Timezone (
    val new: String? = null,
    val old: String? = null
)

enum class PSEventsPerfornalDetailsUpdatedEventType(val value: String) {
    PokerstarsPersonalDetailsUpdated("@@pokerstars/personal_details_updated");

    companion object {
        public fun fromValue(value: String): PSEventsPerfornalDetailsUpdatedEventType = when (value) {
            "@@pokerstars/personal_details_updated" -> PokerstarsPersonalDetailsUpdated
            else                                    -> throw IllegalArgumentException()
        }
    }
}

/**
 * Triggered when wallets get updated in PokerStars app
 */
data class PSEventsWalletUpdatedEvent (
    val kind: Kind,
    val meta: PSEventsWalletUpdatedEventMeta,
    val payload: PSEventsWalletUpdatedEventPayload,

    /**
     * Defines the UID for this event
     */
    val type: PSEventsWalletUpdatedEventType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<PSEventsWalletUpdatedEvent>(json)
    }
}

data class PSEventsWalletUpdatedEventMeta (
    val origin: Origin? = null
)

data class PSEventsWalletUpdatedEventPayload (
    val details: Details,
    val name: Name
)

data class Details (
    val amount: Double,
    val availabletobet: Double? = null,
    val bonus: Double? = null,
    val bonuses: Double? = null,
    val deposits: Double? = null,
    val real: Double? = null,
    val winnings: Double? = null
)

enum class Name(val value: String) {
    ArcadeBonus("ARCADE_BONUS"),
    Bingo("BINGO"),
    BingoBonus("BINGO_BONUS"),
    BoostTokens("BOOST_TOKENS"),
    Casino("CASINO"),
    CasinoBonus("CASINO_BONUS"),
    CasinoBonusCash("CASINO_BONUS_CASH"),
    CasinoFunBonus("CASINO_FUN_BONUS"),
    ExchangeBonusCash("EXCHANGE_BONUS_CASH"),
    FantasyBonus("FANTASY_BONUS"),
    Frozen("FROZEN"),
    GamesBonus("GAMES_BONUS"),
    GamingBonus("GAMING_BONUS"),
    GamingBonusTotal("GAMING_BONUS_TOTAL"),
    Ita("ITA"),
    Main("MAIN"),
    MainExposure("MAIN_EXPOSURE"),
    MoneyBackTokens("MONEY_BACK_TOKENS"),
    Poker("POKER"),
    RtBonus("RT_BONUS"),
    SportsbookBonus("SPORTSBOOK_BONUS"),
    SportsbookBonusCash("SPORTSBOOK_BONUS_CASH"),
    SportsbookBonusWagering("SPORTSBOOK_BONUS_WAGERING"),
    Total("TOTAL"),
    UnknownValue("UNKNOWN_VALUE"),
    VegasBonus("VEGAS_BONUS"),
    Virtualsports("VIRTUALSPORTS"),
    VirtualsportsBonusCash("VIRTUALSPORTS_BONUS_CASH"),
    VirtualsportsBonusWagering("VIRTUALSPORTS_BONUS_WAGERING"),
    Xg("XG");

    companion object {
        public fun fromValue(value: String): Name = when (value) {
            "ARCADE_BONUS"                 -> ArcadeBonus
            "BINGO"                        -> Bingo
            "BINGO_BONUS"                  -> BingoBonus
            "BOOST_TOKENS"                 -> BoostTokens
            "CASINO"                       -> Casino
            "CASINO_BONUS"                 -> CasinoBonus
            "CASINO_BONUS_CASH"            -> CasinoBonusCash
            "CASINO_FUN_BONUS"             -> CasinoFunBonus
            "EXCHANGE_BONUS_CASH"          -> ExchangeBonusCash
            "FANTASY_BONUS"                -> FantasyBonus
            "FROZEN"                       -> Frozen
            "GAMES_BONUS"                  -> GamesBonus
            "GAMING_BONUS"                 -> GamingBonus
            "GAMING_BONUS_TOTAL"           -> GamingBonusTotal
            "ITA"                          -> Ita
            "MAIN"                         -> Main
            "MAIN_EXPOSURE"                -> MainExposure
            "MONEY_BACK_TOKENS"            -> MoneyBackTokens
            "POKER"                        -> Poker
            "RT_BONUS"                     -> RtBonus
            "SPORTSBOOK_BONUS"             -> SportsbookBonus
            "SPORTSBOOK_BONUS_CASH"        -> SportsbookBonusCash
            "SPORTSBOOK_BONUS_WAGERING"    -> SportsbookBonusWagering
            "TOTAL"                        -> Total
            "UNKNOWN_VALUE"                -> UnknownValue
            "VEGAS_BONUS"                  -> VegasBonus
            "VIRTUALSPORTS"                -> Virtualsports
            "VIRTUALSPORTS_BONUS_CASH"     -> VirtualsportsBonusCash
            "VIRTUALSPORTS_BONUS_WAGERING" -> VirtualsportsBonusWagering
            "XG"                           -> Xg
            else                           -> throw IllegalArgumentException()
        }
    }
}

enum class PSEventsWalletUpdatedEventType(val value: String) {
    PokerstarsWalletUpdated("@@pokerstars/wallet_updated");

    companion object {
        public fun fromValue(value: String): PSEventsWalletUpdatedEventType = when (value) {
            "@@pokerstars/wallet_updated" -> PokerstarsWalletUpdated
            else                          -> throw IllegalArgumentException()
        }
    }
}
