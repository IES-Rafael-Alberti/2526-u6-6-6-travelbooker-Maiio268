package presentacionUI

import dominio.ReservaDeVuelo

fun main(){
    var opcion: Int
    do{
        print("=== MENÚ DE RESERVAS ===")
        println("1) Reserva de Vuelo")
        println("2) Reserva de Hotel")
        println("0) Salir")
        println("Introduce un numero como opción (0 / 1 / 2): ")
        opcion = readln().toIntOrNull()?:-1
        if (opcion == 0) {
            println("Saliendo del Menú...")
        }
        else if (opcion == 1){
            println("Entrando en Reserva de Vuelo...")
            crearReservaVuelo()


        }
        else if (opcion == 2){
            println("Entrando en Reserva de Hotel...")



        }

    } while (opcion != 0)


}
fun crearReservaVuelo(){
    println("Introduce la descripcion: ")
    var descripcion = readln()?:""
    ReservaDeVuelo.creaInstancia()
}
fun crearReservaHotel(){

}