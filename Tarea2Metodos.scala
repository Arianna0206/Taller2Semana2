package Taller2

object Tarea2Metodos extends App{

  def fill(): Unit = {

    println("----------List.fill----------")
    val site = List.fill(4)("Google")
    println("El sitio web es se repite 4: " + site)

    val num = List.fill(6)(5)
    println(" El número 5 se repite 6 veces: " + num)

  }
  fill()

  def tabulate(): Unit = {

    println("\n----------List.tabulate----------")
    val cuadrados = List.tabulate(6)(n => n * n)
    println("Unidimensional:" + cuadrados)

    val mul = List.tabulate(4, 5)(_ * _)
    println("Multidimensional:" + mul)

  }
  tabulate()

  def reverse(): Unit = {

    println("\n----------List.reverse----------")
    val sitios = "Youtube" :: ("Google" :: ("Facebook" :: Nil))
    println("sitios web: " + sitios)

    println("sitios web: " + sitios.reverse)

  }
  reverse()

  def concat(): Unit = {

    println("\n----------List.concat----------")
    val fruit1 = "Manzana" :: ("Pera" :: ("Sandia" :: Nil))
    val fruit2 = "Uva" :: ("Fresa" :: Nil)

    var fruit = fruit1 ::: fruit2
    println("fruit1 ::: fruit2 : " + fruit)

    fruit = fruit1.:::(fruit2)
    println("fruit1.:::(fruit2) : " + fruit)

    fruit = List.concat(fruit, fruit2)
    println("List.concat(fruit1, fruit2) : " + fruit)

  }
  concat()

  def range(): Unit = {

    println("\n----------List.range----------")
    var Range1 = List.range(10, 20, 2)
    var Range2 = List.range(10,20)

    for ( x <- Range1 ) {
      print( " ( " + x + " ) " )
    }

    println()

    for ( x <- Range2 ) {
      print( " ( " + x + " ) " )
    }
  }

  range()


  def calcularPromedio(): Unit = {

    println("\n----------Calculo de Promedio----------")

    val materia1 = List(8.7, 7, 8, 9)
    val materia2 = List(10, 5, 6, 8.5)
    val materia3 = List(5.6, 6.9, 7.6)

    var materias = List.concat(materia1, materia2, materia3)

    for (m <- 1 to 1) {
      println("Notas de las materias: " +
                    "\nMateria 1 : " + materia1 +
                    "\nMateria 2 : " + materia2 +
                    "\nMateria 3 : " + materia3)
    }

    var suma: Double = 0
    materias.foreach(suma += _)
    println("suma totas de notas: " + suma)
    var promedio = suma/materias.length
    println("promedio total de notas: " + promedio)
  }

  calcularPromedio()

  }





