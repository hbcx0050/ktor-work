// Task 4.7

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondTemplate("form.peb", emptyMap())
        }

        // Add route to handle POST requests containing form data
        post("/roll") {
            val parameters = call.receiveParameters()
            val numDice = parameters["num_dice"]?.toIntOrNull() ?: 1
            val dieSides = parameters["die_sides"]?.toIntOrNull() ?: 6

            val diceRoll = DiceRoll(numDice, dieSides)
            call.respondTemplate("result.peb", mapOf("roll" to diceRoll))
        }

        // Add route to handle GET requests for URLs like /roll/3d8
        get("/roll/{spec}") {
            val spec = call.parameters["spec"]?.split("d")
            val numDice = spec?.getOrNull(0)?.toIntOrNull() ?: 1
            val dieSides = spec?.getOrNull(1)?.toIntOrNull() ?: 6

            val diceRoll = DiceRoll(numDice, dieSides)
            call.respondTemplate("result.peb", mapOf("roll" to diceRoll))
        }
    }
}
