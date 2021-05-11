package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val cliente = Cliente(Resfriado, "LasLauchas",1000)

    describe("Prueba de propina"){
      cliente.propina(500).shouldBe(500)
    }
    describe("Estado de animo del cliente"){
      cliente.estadoDelCliente.shouldBe(Resfriado)
    }
    describe("Cantidad de plata en el bolsillo del cliente"){
      cliente.dineroEnBolsillo.shouldBe(1000)
    }
    describe("Donde vive el cliente"){
      cliente.viveEn.shouldBe("LasLauchas")
    }
  }
})
