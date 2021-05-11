package ar.edu.unahur.obj2.socios

class Cliente( val estadoDelCliente : EstadoAnimoCliente, val viveEn : String, val dineroEnBolsillo: Int = 0) {
    fun propina(importePedido: Int) = estadoDelCliente.propina(this,importePedido)
}
abstract class EstadoAnimoCliente() {
    abstract fun propina(cliente: Cliente,importePedido:Int):Int
}

object Enojado : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = 0
}

object Feliz : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = importePedido * 0.25.toInt()
}

object Indiferente: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = cliente.dineroEnBolsillo
}

object Resfriado: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido: Int) = importePedido
}



//object LasRosas{
//    fun influencia(cliente: Cliente) = 50
//}
//object LasLauchas{
//    fun influencia(cliente:Cliente) = cliente.propina() /2
//}
//object BarrioVerde{
//    fun influencia(cliente:Cliente) = cliente.propina().min(200)
//}
//object LasTorres{
//    fun influencia(cliente:Cliente) = cliente.propina() == 0

//}