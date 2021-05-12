package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    var cliente = Cliente(Resfriado, LasLauchas,1000)
    describe("Estado de animo del cliente"){
      cliente.estadoDeAnimo.shouldBe(Resfriado)
    }
    describe("Cantidad de plata en el bolsillo del cliente"){
      cliente.dineroEnBolsillo.shouldBe(1000)
    }
    describe("Donde vive el cliente"){
      cliente.viveEn.shouldBe(LasLauchas)
    }
    describe("Propina de un pedido de 100 pesos dependiendo su estado de animo"){
      it("Cuando esta enojado ") {
        cliente.viveEn = LasTorres
        cliente.estadoDeAnimo = Enojado
        cliente.propina(100).shouldBe(0)
      }
      it("Cuando esta feliz") {
        cliente.viveEn = LasTorres
        cliente.estadoDeAnimo = Feliz
        cliente.propina(100).shouldBe(25)
      }
      it("Cuando esta indiferente") {
        cliente.viveEn = LasTorres
        cliente.estadoDeAnimo = Indiferente
        cliente.propina(100).shouldBe(1000)
      }
      it("Cuando esta resfriado") {
        cliente.viveEn = LasTorres
        cliente.estadoDeAnimo = Resfriado
        cliente.propina(100).shouldBe(100)
      }
    }
    describe("Propina de un pedido de 100 pesos dependiendo de donde vive"){
      it("Si Vive en Las Rosas"){
        cliente.viveEn = LasRosas
        cliente.estadoDeAnimo = Enojado
        cliente.propina(100).shouldBe(50)
      }
      it("Si Vive en Las Lauchas"){
        cliente.viveEn = LasLauchas
        cliente.estadoDeAnimo = Enojado
        cliente.propina(100).shouldBe(0)
      }
      it("Si Vive en Barrio Verde"){
        cliente.viveEn = BarrioVerde
        cliente.estadoDeAnimo = Enojado
        cliente.propina(100).shouldBe(200)
      }
      it("Si Vive en Las Torres"){
        cliente.viveEn = LasTorres
        cliente.estadoDeAnimo = Enojado
        cliente.propina(100).shouldBe(0)
      }
    }

    describe("Propina de un pedido de 1000 pesos dependiendo su estado de animo y donde vive") {
      it("Está enojado y Vive en las Rosas") {
        cliente.estadoDeAnimo = Enojado
        cliente.viveEn = LasRosas
        cliente.propina(1000).shouldBe(50)
      }
      it( "Está resfriado y vive en Las Lauchas") {
        cliente.estadoDeAnimo = Resfriado
        cliente.viveEn = LasLauchas
        cliente.propina(1000).shouldBe(500)
      }
      it("Está feliz y vive en Barrio Verde") {
        cliente.estadoDeAnimo = Feliz
        cliente.viveEn = BarrioVerde
        cliente.propina(1000).shouldBe(250)
      }
      it("Está indiferente y vive en Las Torres.") {
        cliente.estadoDeAnimo = Indiferente
        cliente.viveEn = LasTorres
        cliente.propina(1000).shouldBe(1000)
      }
    }
  }
})
