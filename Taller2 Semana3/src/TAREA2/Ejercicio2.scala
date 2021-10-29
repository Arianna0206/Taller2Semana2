package TAREA2
import Array._
import scala.util

object Ejercicio2 extends App{

    var arr = Array(2, 3, 5, 7, -7, 5, 8, -5)
    scala.util.Sorting.quickSort(arr)
    val b = arr.max // último número
    val c = arr.dropRight(1)// eliminar el ultimo
    val d = c.max // penultimo numero
    val product = b * d
    println(product)



}









