package TAREA2

import scala.collection.mutable.ListBuffer

object Ejercicio5 extends App {

  val a = List(1,2,3,4,4,3,2,1)
  val b = a.reverse // le da la vuelta
  val c = b.intersect(a) // compara la lista 

    println("La lista es un palindromo: " + c)
}
