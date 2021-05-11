package ar.edu.unahur.obj2.socios

class Cliente(private val estadoDelCliente = object, val viveEn = object, val bolsillo: Int = 0, val pedido: Pedido) {
    fun propina() = estadoDelCliente.modificador
    fun estadoActual() = estadoDelCliente
}
class Pedido(val precio: Int = 0)

object Enojado{
    fun modificador(cliente: Cliente) = 0
}
object Feliz{
    fun modificador(cliente: Cliente) = cliente.pedido.precio * 0.25
}
object Indiferente{
    fun modificador(cliente: Cliente) = cliente.bolsillo
}
object Resfriado{
    fun modificador(cliente: Cliente) = cliente.pedido.precio
}

object LasRosas{
    fun influencia(cliente: Cliente) = 50
}
object LasLauchas{
    fun influencia(cliente:Cliente) = cliente.propina() /2
}
object BarrioVerde{
    fun influencia(cliente:Cliente) = cliente.propina().min(200)
}
object LasTorres{
    fun influencia(cliente:Cliente) = cliente.propina() == 0

}