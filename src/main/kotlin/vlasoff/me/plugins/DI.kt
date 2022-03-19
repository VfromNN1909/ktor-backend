package vlasoff.me.plugins

import io.ktor.application.*
import org.koin.ktor.ext.Koin
import org.koin.logger.SLF4JLogger
import vlasoff.me.di.appModule

fun Application.configureDI() {
    install(Koin) {
        SLF4JLogger()
        modules(appModule)
    }
}