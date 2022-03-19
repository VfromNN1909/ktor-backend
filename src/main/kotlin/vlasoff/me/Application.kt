package vlasoff.me

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import vlasoff.me.plugins.configureDI
import vlasoff.me.plugins.configureMonitoring
import vlasoff.me.plugins.configureRouting
import vlasoff.me.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
        configureDI()
        configureMonitoring()
        configureSerialization()
    }.start(wait = true)
}
