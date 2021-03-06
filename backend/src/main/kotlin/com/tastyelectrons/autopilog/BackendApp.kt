package com.tastyelectrons.autopilog

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Application.main() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        get("/") {
            Logger.getLogger("BackendApp").info("Saluuuuttt")
            call.respondText("Test Backend la App - ${Greeting().helloWorld()}", ContentType.Text.Html)
        }
    }
}