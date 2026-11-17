// Task 4.8: organizing routes

import io.ktor.server.application.*
import io.ktor.server.routing.*

// Routing configuration

fun Application.configureRouting() {
    routing {
        get("/") { call.diceForm() }
        get("/roll") { call.rollResult() }
    }
}
