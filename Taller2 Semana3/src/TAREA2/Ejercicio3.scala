package TAREA2
import Array._

object Ejercicio3 extends App {

    val arreglo = Array(20, 12, 23, 17, 7, 8, 10, 2, 1)
    var np = 0
    var nip = 0
    for (i <- arreglo) {
      if (i % 2 == 0) {
        print(i + ",")
      }
    }
    for(i <- arreglo){
      if(i % 2 !=0){
        print(i + ",")
      }
    }
  }




