// To parse the JSON, install Klaxon and do:
//
//   val sBKCommandsDepositCommand = SBKCommandsDepositCommand.fromJson(jsonString)
//   val sBKCommandsLoginCommand = SBKCommandsLoginCommand.fromJson(jsonString)
//   val sBKCommandsNavigateCommand = SBKCommandsNavigateCommand.fromJson(jsonString)

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
    .convert(SBKCommandsDepositCommandType::class,  { SBKCommandsDepositCommandType.fromValue(it.string!!) },  { "\"${it.value}\"" })
    .convert(SBKCommandsLoginCommandType::class,    { SBKCommandsLoginCommandType.fromValue(it.string!!) },    { "\"${it.value}\"" })
    .convert(Target::class,                         { Target.fromValue(it.string!!) },                         { "\"${it.value}\"" })
    .convert(SBKCommandsNavigateCommandType::class, { SBKCommandsNavigateCommandType.fromValue(it.string!!) }, { "\"${it.value}\"" })

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class SBKCommandsDepositCommand (
    val kind: Kind,
    val meta: SBKCommandsDepositCommandMeta,

    /**
     * Defines the UID for this event
     */
    val type: SBKCommandsDepositCommandType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<SBKCommandsDepositCommand>(json)
    }
}

/**
 * Identifies the message as being a Command
 */
enum class Kind(val value: String) {
    Command("command");

    companion object {
        public fun fromValue(value: String): Kind = when (value) {
            "command" -> Command
            else      -> throw IllegalArgumentException()
        }
    }
}

data class SBKCommandsDepositCommandMeta (
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

enum class SBKCommandsDepositCommandType(val value: String) {
    SportsbookDeposit("@@sportsbook/deposit");

    companion object {
        public fun fromValue(value: String): SBKCommandsDepositCommandType = when (value) {
            "@@sportsbook/deposit" -> SportsbookDeposit
            else                   -> throw IllegalArgumentException()
        }
    }
}

/**
 * Triggered when a user cashes out a bet in My Bets
 */
data class SBKCommandsLoginCommand (
    val kind: Kind,
    val meta: SBKCommandsLoginCommandMeta,

    /**
     * Defines the UID for this event
     */
    val type: SBKCommandsLoginCommandType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<SBKCommandsLoginCommand>(json)
    }
}

data class SBKCommandsLoginCommandMeta (
    val origin: Origin? = null
)

enum class SBKCommandsLoginCommandType(val value: String) {
    SportsbookLogin("@@sportsbook/login");

    companion object {
        public fun fromValue(value: String): SBKCommandsLoginCommandType = when (value) {
            "@@sportsbook/login" -> SportsbookLogin
            else                 -> throw IllegalArgumentException()
        }
    }
}

/**
 * Signal to instruct the subscriber (PokerStart host app) to perform a navigation to a
 * given URL
 */
data class SBKCommandsNavigateCommand (
    val kind: Kind,
    val payload: Payload,
    val type: SBKCommandsNavigateCommandType
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<SBKCommandsNavigateCommand>(json)
    }
}

data class Payload (
    val target: Target,
    val url: String
)

enum class Target(val value: String) {
    External("external"),
    Internal("internal");

    companion object {
        public fun fromValue(value: String): Target = when (value) {
            "external" -> External
            "internal" -> Internal
            else       -> throw IllegalArgumentException()
        }
    }
}

enum class SBKCommandsNavigateCommandType(val value: String) {
    SportsbookNavigate("@@sportsbook/navigate");

    companion object {
        public fun fromValue(value: String): SBKCommandsNavigateCommandType = when (value) {
            "@@sportsbook/navigate" -> SportsbookNavigate
            else                    -> throw IllegalArgumentException()
        }
    }
}
