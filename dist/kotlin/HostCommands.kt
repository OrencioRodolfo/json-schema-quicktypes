// To parse the JSON, install Klaxon and do:
//
//   val hostCommands = HostCommands.fromJson(jsonString)

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
    .convert(Target::class, { Target.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(Type::class,   { Type.fromValue(it.string!!) },   { "\"${it.value}\"" })

/**
 * Signal to instruct the subscriber (Sportsbook embed app) to perform a navigation to a
 * given URL
 */
data class HostCommands (
    val kind: Kind,
    val payload: Payload,
    val type: Type
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<HostCommands>(json)
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

enum class Type(val value: String) {
    HostNavigate("@@host/navigate");

    companion object {
        public fun fromValue(value: String): Type = when (value) {
            "@@host/navigate" -> HostNavigate
            else              -> throw IllegalArgumentException()
        }
    }
}
