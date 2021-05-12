package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val cliente = Cliente(Resfriado, LasLauchas,1000)
    describe("Estado de animo del cliente"){
      cliente.estadoDelCliente.shouldBe(Resfriado)
    }
    describe("Cantidad de plata en el bolsillo del cliente"){
      cliente.dineroEnBolsillo.shouldBe(1000)
    }
    describe("Donde vive el cliente"){
      cliente.viveEn.shouldBe(LasLauchas)
    }
    describe("Propina dependiendo su estado de animo"){
      it("Cuando esta enojado ") {
        cliente.estadoDelCliente = Enojado
        cliente.propina(100).shouldBe(0)
      }
      it("Cuando esta feliz") {
        cliente.estadoDelCliente = Feliz
        cliente.propina(100).shouldBe(25)
      }
      it("Cuando esta indiferente") {
        cliente.estadoDelCliente = Indiferente
        cliente.propina(100).shouldBe(1000)
      }
      it("Cuando esta resfriado") {
        cliente.estadoDelCliente = Resfriado
        cliente.propina(100).shouldBe(100)
      }
    }
    describe("Propina dependiendo de donde vive"){
      it("Si Vive en Las Rosas"){
        cliente.viveEn = LasRosas
        cliente.estadoDelCliente = Resfriado
        cliente.propinaConModificacionDeResidencia(100).shouldBe(150)
      }
      it("Si Vive en Las Lauchas"){
        cliente.viveEn = LasLauchas
        cliente.estadoDelCliente = Resfriado
        cliente.propinaConModificacionDeResidencia(100).shouldBe(50)
      }
      it("Si Vive en Barrio Verde"){
        cliente.viveEn = BarrioVerde
        cliente.estadoDelCliente = Resfriado
        cliente.propinaConModificacionDeResidencia(100).shouldBe(200)
      }
      it("Si Vive en Las Torres"){
        cliente.viveEn = LasTorres
        cliente.estadoDelCliente = Resfriado
        cliente.propinaConModificacionDeResidencia(100).shouldBe(100)
      }
    }
  }
})
