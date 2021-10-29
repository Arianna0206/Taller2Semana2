package TAREA2

object Ejercicio4 extends App{

  val numeros = List(8, 4, 6, 1, 3, 7, 5)
  for (num <- numeros) {
    println(num)
  }
  var suma: Int = 0
  numeros.foreach(suma += _)
  println("suma: " + suma)
  var multi: Int = 1
  numeros.foreach(multi *= _)
  println("Producto: " + multi)

}
