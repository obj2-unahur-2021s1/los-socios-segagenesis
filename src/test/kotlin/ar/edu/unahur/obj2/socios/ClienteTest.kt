package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val pedido1 = Pedido(1000)
    val cliente = Cliente(Resfriado, LasLauchas,1000,pedido1)
    cliente.modificarPropina()

    describe("Prueba de propina"){
      cliente.propina().shouldBe(500)
    }
    describe("Estado de animo del cliente"){
      cliente.estadoActual().shouldBe(Resfriado)
    }
    describe("Cantidad de plata en el bolsillo del cliente"){
      cliente.bolsillo.shouldBe(1000)
    }
    describe("Donde vive el cliente"){
      cliente.viveEn.shouldBe(LasLauchas)
    }
  }
})
