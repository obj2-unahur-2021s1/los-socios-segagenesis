package ar.edu.unahur.obj2.socios

class Cliente( var estadoDelCliente : EstadoAnimoCliente, var viveEn : Barrios, var dineroEnBolsillo: Int = 0) {
    fun propina(importePedido: Int) = estadoDelCliente.propina(this,importePedido) and viveEn.modificador(estadoDelCliente,this,importePedido)
}
abstract class EstadoAnimoCliente() {
    abstract fun propina(cliente: Cliente,importePedido:Int):Int
}

object Enojado : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = 0
}

object Feliz : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = ((importePedido * 0.25).toInt())
}

object Indiferente: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = (cliente.dineroEnBolsillo)
}

object Resfriado: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido: Int) = (importePedido)
}


abstract class Barrios(){
    abstract fun modificador(estadoDelCliente: EstadoAnimoCliente,cliente: Cliente,importePedido: Int):Int
}
object LasRosas: Barrios(){
    override fun modificador(estadoDelCliente: EstadoAnimoCliente,cliente: Cliente,importePedido: Int) = (estadoDelCliente.propina(cliente,importePedido)) + 50
}
object LasLauchas: Barrios(){
    override fun modificador(estadoDelCliente: EstadoAnimoCliente,cliente:Cliente,importePedido: Int) = (estadoDelCliente.propina(cliente,importePedido))* 0.5.toInt()
}
object BarrioVerde: Barrios() {
    override fun modificador(estadoDelCliente: EstadoAnimoCliente,cliente: Cliente, importePedido: Int) = 200
}
object LasTorres : Barrios() {
    override fun modificador(estadoDelCliente: EstadoAnimoCliente,cliente: Cliente,importePedido: Int) = estadoDelCliente.propina(cliente,importePedido)
}
