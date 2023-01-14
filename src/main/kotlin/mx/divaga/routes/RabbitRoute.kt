package mx.divaga.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import mx.divaga.data.model.Rabbit

private const val BASE_URL = "http://192.168.4.55:8080"

private val listRabbits = listOf(
    Rabbit("NOMBRE1", "DESCRIPCION1", "$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("NOMBRE2", "DESCRIPCION2", "$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("NOMBRE3", "DESCRIPCION3", "$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("NOMBRE4", "DESCRIPCION4", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("NOMBRE5", "DESCRIPCION5", "$BASE_URL/rabbits/rabbit5.jpg")
)

fun Route.randomRabbit() {
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            listRabbits.random()
        )
    }
}