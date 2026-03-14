package datos

import dominio.Reserva

// En esta clase se implementa la lógica de los métodos de la interfaz IReservaRepository
// agregar() y devolverListaCompleta()
class ReservaRepositoryMemory <T: Reserva> : IReservaRepository<T> {
    private val lista = mutableListOf<T>()
    override fun agregar(reserva: T) {
        lista.add(reserva)
    }
    override fun devolverListaCompleta() : List<T>{
        return lista
    }
}