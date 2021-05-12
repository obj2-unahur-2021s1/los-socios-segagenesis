package ar.edu.unahur.obj2.socios

class Cliente(var estadoDeAnimo : EstadoAnimoCliente, var viveEn : Barrio, var dineroEnBolsillo: Int = 0) {

    fun propina(importePedido: Int): Int {
        val propina = estadoDeAnimo.propina(this,importePedido)
        return this.viveEn.propina(this,propina)
    }
}

abstract class EstadoAnimoCliente() {
    abstract fun propina(cliente: Cliente,importePedido:Int):Int
}

object Enojado : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = 0
}

object Feliz : EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = (importePedido * 0.25).toInt()
}

object Indiferente: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido:Int) = cliente.dineroEnBolsillo
}

object Resfriado: EstadoAnimoCliente() {
    override fun propina(cliente: Cliente,importePedido: Int) = importePedido
}


abstract class Barrio  {
    abstract fun propina(cliente: Cliente, importePropina: Int):Int
}

object LasRosas: Barrio() {
    override fun propina(cliente: Cliente, importePropina: Int) = importePropina + 50
}

object LasLauchas: Barrio() {
    override fun propina(cliente:Cliente, importePropina: Int) = importePropina.div(2)
}

object BarrioVerde: Barrio() {
    override fun propina(cliente: Cliente, importePropina: Int) = maxOf(importePropina,200)
}

object LasTorres : Barrio() {
    override fun propina(cliente: Cliente, importePropina: Int) = importePropina
}
