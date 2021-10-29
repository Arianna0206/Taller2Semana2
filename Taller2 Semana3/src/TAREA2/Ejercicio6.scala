package TAREA2

object Ejercicio6 extends App{

  val a = List(1,2,3,4,5,6,7)
  print(a.mkString(","))
  val b = a.flatMap(x => List(x,x,x))
  print("," + b.mkString(","))

}
