package cherhy.example.plugins.api

import com.cherhy.common.util.EndPoint.User.HOME
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.home() {
    get(HOME) {
        call.respondText("health check")
    }
}