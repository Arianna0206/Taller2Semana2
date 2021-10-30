package TallerClase

class Persona2(val strNombre: String, val strApellido: String, var intEdad: Int) {
def Imprimir(strNombre: String): Unit = {
  println(s"Mi nombre es $strNombre y mi apellido es $strApellido " +
    s"con una edad $intEdad años")
}

Imprimir(strNombre)


  override def toString = s"Persona2($strNombre, $strApellido, $intEdad)"
}
