package TAREA2
import scala.io.StdIn.*
import  Array._

object Ejercicio1 extends App{
  val a = Array(2,3,4,5,6,7,8)
  for(x <- 0 to a.length-1){
    for(y <- x to a.length-1){
      if(a(x) + a(y) == 15) println(a(x) + "+" +  a(y) + "= 15" )
    }
  }
   }



