package main

import quicktype.Message
import quicktype.A

fun main() {
    // Create the "message" variable using the Message data class
    val a = A(b = 1, c = 2, d = "Example")
    val message = Message(
        greeting = "Hello from Kotlin!",
        instructions = listOf("Step 1", "Step 2", "Step 3")
        a = a,
    )

    // Print out the message details
    println(message.greeting)
    println(message.a.d)
    println(message.instructions)
}
