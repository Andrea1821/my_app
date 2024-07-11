
Aquí tienes un ejemplo completo en Kotlin que puedes probar en Kotlin Playground:

```kotlin
// Variables
var miVariable = 10
var nombre = "Juan"

// Constantes
val PI = 3.14159

// Opcionales y nulos
var nombreOpcional: String? = null
nombreOpcional = "Juan"

// Función principal
fun main() {
    // Uso de variables
    println("Valor de miVariable: $miVariable")
    println("Nombre: $nombre")

    // Uso de constantes
    println("Valor de PI: $PI")

    // Uso de opcionales y nulos
    if (nombreOpcional != null) {
        println("Nombre opcional: $nombreOpcional")
    } else {
        println("Nombre opcional es null")
    }
}
