/**
 * Universidad del Valle de Guatemala
 * Desarrollo de Aplicaciones Móviles
 * 23764, Angie Nadissa Vela López
 * Laboratorio No. 2 
 */

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

}