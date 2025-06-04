// To parse the JSON, install Klaxon and do:
//
//   val models = Models.fromJson(jsonString)

package quicktype

import com.beust.klaxon.*

private val klaxon = Klaxon()

data class Models (
    val message: Message
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Models>(json)
    }
}

data class Message (
    val a: A,
    val greeting: String,
    val instructions: List<String>
)

data class A (
    val b: Long,
    val c: Long,
    val d: String? = null
)
