// To parse the JSON, install Klaxon and do:
//
//   val hostSportsbookEvents = HostSportsbookEvents.fromJson(jsonString)

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
    .convert(Kind::class,   { Kind.fromValue(it.string!!) },   { "\"${it.value}\"" })
    .convert(Origin::class, { Origin.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(Type::class,   { Type.fromValue(it.string!!) },   { "\"${it.value}\"" })

/**
 * Triggered when a user places a transaction like bet placed or bet cashed out successfuly
 */
data class HostSportsbookEvents (
    val kind: Kind,
    val meta: Meta,

    /**
     * Defines the UID for this event
     */
    val type: Type
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<HostSportsbookEvents>(json)
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

data class Meta (
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

enum class Type(val value: String) {
    SportsbookTransaction("@@sportsbook/transaction");

    companion object {
        public fun fromValue(value: String): Type = when (value) {
            "@@sportsbook/transaction" -> SportsbookTransaction
            else                       -> throw IllegalArgumentException()
        }
    }
}
