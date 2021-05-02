package ar.edu.unahur.obj2.socios

class Cliente (val estadoActual = EstadosDelCliente, val viveEn = Barrios,val bolsillo = Int, val pedido: Pedido){
    fun propina = EstadosDelCliente
    fun valorPedido = Pedido
}


// esto puede ir en otro archivo pero no me deja crearlo
class EstadosDelCliente(){
    fun propina = Int
}
override class Enojado(): EstadosDelCliente{
    fun propina = 0
}
override class Feliz() : EstadosDelCliente{
    fun propina = valorPedido * 0.25
}
override class Indiferente(): EstadosDelCliente{
    fun propina = cliente.bolsillo
}
override class Resfriado(): EstadosDelCliente{
    fun propina = cliente.valorPedido
}

// idem anterior otro archivo

class Pedido(val precio = Int){

}

// idem anterior

class Barrios(){
    fun influencia = Float
}

override class LasRosas() : Barrios{
    fun influencia = 50
}
override class LasLauchas(): Barrios{
    fun influencia = cliente.daPropina /2
}
override class BarrioVerde(): Barrios{
    fun influencia = cliente.propina = 200
}
override class LasTorres(): Barrios{

}