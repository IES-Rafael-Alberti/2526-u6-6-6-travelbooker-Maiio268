package dominio

class ReservaDeHotel private constructor(descripcion: String, val ubicacion: String, val numeroNoches: Int) :
    Reserva(descripcion){
    override val detalle: String
        get() = "$id - $descripcion - $ubicacion ($numeroNoches)"

    override fun toString(): String{
        return "=== DETALLES DE LA RESERVA DE HOTEL ===" +
                "Descripción: $descripcion, " +
                "Ubicación: $ubicacion, " +
                "Numero Coches: $numeroNoches, " +
                "Detalles: $detalle"
    }
    companion object{
        fun creaInstancia(descripcion: String, ubicacion: String, numeroNoches: Int) : ReservaDeHotel {
            val objetoReservaHotel = ReservaDeHotel(descripcion, ubicacion, numeroNoches)
            return objetoReservaHotel
        }
    }
}