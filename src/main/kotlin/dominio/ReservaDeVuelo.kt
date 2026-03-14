package dominio

import java.sql.Time

class ReservaDeVuelo private constructor(descripcion: String, val origen: String, val destino: String, val horaVuelo: String) :
    Reserva(descripcion) {
    override val detalle: String
        get() = "$id - $descripcion - $origen -> $destino [$horaVuelo]"

    override fun toString(): String {
        return "=== DETALLES DE LA RESERVA DE VUELO ===" +
                "Descripcion: $descripcion, " +
                "Origen: $origen, " +
                "Destino: $destino" +
                "Hora Vuelo: $horaVuelo" +
                "Detalles: $detalle"
    }
    companion object{
        fun creaInstancia(descripcion: String, origen: String, destino: String, horaVuelo: String) : ReservaDeVuelo {
            val objetoReservaVuelo = ReservaDeVuelo(descripcion, origen, destino, horaVuelo)
            return objetoReservaVuelo
        }
    }

}