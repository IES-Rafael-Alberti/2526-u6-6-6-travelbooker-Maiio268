package datos
import dominio.Reserva

// Interfaz que define el contrato que cualquier repositorio
// debe cumplir para poder almacenar y recuperar una reserva
// El servicio dependerá de esta abstracción y no de una
// implementación en concreto
// Se llaman a los métodos desde esta interfaz, la clase ReservaRepositoryMemory
// sólo implementa la lógica pero se llaman desde aquí
interface IReservaRepository <T: Reserva> {
    fun agregar(reserva: T)
    fun devolverListaCompleta(): List<T>
}