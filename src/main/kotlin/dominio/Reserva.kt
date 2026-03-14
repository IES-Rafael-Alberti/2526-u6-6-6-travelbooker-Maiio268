package dominio

import java.time.LocalDateTime

abstract class Reserva(val descripcion: String) {
    val id: String = ""
    val fechaCreacion: LocalDateTime = LocalDateTime.now()

    open val detalle: String
        get() = "$id - $descripcion"
}
