package logicaAplicacion

import datos.IReservaRepository
import dominio.Reserva
import dominio.ReservaDeHotel
import dominio.ReservaDeVuelo
import kotlin.String

class ReservaService(private val repository: IReservaRepository<Reserva>) {
    fun crearReservaVuelo(descripcion: String, origen: String, destino: String, horaVuelo: String) : ReservaDeVuelo{
        val reserva = ReservaDeVuelo.creaInstancia(descripcion, origen, destino, horaVuelo)
        repository.agregar(reserva)
        return reserva
    }
    fun crearReservaHotel(descripcion: String, ubicacion: String, numeroNoches: Int) : ReservaDeHotel{
        val reserva = ReservaDeHotel.creaInstancia(descripcion, ubicacion, numeroNoches)
        repository.agregar(reserva)
        return reserva
    }
}