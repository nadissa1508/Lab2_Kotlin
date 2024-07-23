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



fun main(){

    //INCISO 1 - calcular promedio
    val numeros = listOf(1, 2, 3, 4, 6)
    val resultado = calcularPromedio(numeros)
    println("Promedio de la lista : $resultado")

}