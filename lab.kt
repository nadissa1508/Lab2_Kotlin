/**
 * Universidad del Valle de Guatemala
 * Desarrollo de Aplicaciones Móviles
 * 23764, Angie Nadissa Vela López
 * Laboratorio No. 2 
 */

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

//Función calcular promedio
fun calcularPromedio(numeros: List<Int>): Double{
    return (numeros.reduce { acc, num -> acc + num }).toDouble() / numeros.size   
}

//Función para filtrar números impares
fun filtrarNumeros(numeros: List<Int>): List<Int>{
    return numeros.filter { x -> x % 2 != 0 }
}

//Función que detecta un palindromo
fun verificarPalindromo(palabra: String): Boolean = palabra.lowercase() == palabra.lowercase().reversed()

//Función para el inciso 5
fun performOperation(num1: Int, num2: Int, operation: (Int, Int) -> Int): Int{
    return operation(num1, num2)
}

//Función para el inciso 6 - mapeo de objeto person a objeto estudiante
fun transformPerson(persona: Person): Student{
    return Student(persona.name , persona.age, persona.gender, "23764")
}


fun main(){

    //INCISO 1 - calcular promedio
    val numeros = listOf(1, 2, 3, 4, 6)
    val resultado = calcularPromedio(numeros)
    println("Promedio de la lista : $resultado")

    //INCISO 2 - filtrar impares
    val numerosImpares = filtrarNumeros(numeros)
    println("\nNúmeros impares de la lista : $numerosImpares")

     //Inciso 3 - identificar palindromos
    var palabra = "Hola"
    var esPalindromo = verificarPalindromo(palabra)
    println("\n$palabra es palindromo¨? : $esPalindromo")

    palabra = "arenera"
    esPalindromo = verificarPalindromo(palabra)
    println("\n$palabra es palindromo¨? : $esPalindromo")

    //Inciso 4 - uso de la función map
    println("\nUso de la función map:")
    var nombres = listOf("Nadissa", "Sarah", "Siona", "Nani")
    val nombresSaludo = nombres.map { "¡Hola, ${it}!" }
    nombresSaludo.forEach { println(it) }

    //Inciso 5 - lambda como parámetro
    var resultado2 = performOperation(8, 5, {x: Int, y: Int -> x * y})
    println("\nFunción performOperation: $resultado2") 
    
    resultado2 = performOperation(100, 5, {x: Int, y: Int -> x / y})
    println("\nFunción performOperation: $resultado2") 

    //Inciso 6 - person y student
    println("\nLista de estudiantes: ")
    val personas = listOf(
        Person("Nadissa", 21, "Femenino"),
        Person("Marco", 22, "Masculino"),
        Person("Ana", 23, "Femenino")
    )

    val estudiantes = personas.map {person -> transformPerson(person)}
    estudiantes.forEach { student -> println("El estudiante ${student.name} tiene ${student.age} años") }

}