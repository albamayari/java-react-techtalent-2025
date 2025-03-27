package UD06;
//introduce un scaneer
import java.util.Scanner;
public class T6ejercicio06 {
//este ejercicio me pide que: Crea una aplicación que nos cuente el número de cifras de un número entero positivo pedido por teclado.
//Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
	public static void main(String[] args) {
		// Paso 1: Pedir un número entero positivo al usuario
		System.out.println("Introduce un número entero positivo: "); // Mostramos mensaje en consola

		// Creamos un objeto Scanner para leer lo que el usuario escribe
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt(); // Guardamos en la variable 'numero' el valor introducido por el usuario
		sc.close(); // Cerramos el Scanner (buena práctica en Java cuando ya no lo usamos)

		// Paso 2: Llamamos al método que cuenta las cifras
		// Usamos un método que se llama contarCifras y devuelve un número entero
		int resultado = contarCifras(numero); // Guardamos el resultado en la variable 'resultado'

		// Paso 3: Mostramos el resultado por pantalla
		System.out.printf("El número %d tiene %d cifras.%n", numero, resultado);
	}

	// Paso 4: Método que cuenta las cifras de un número entero positivo
	// Este método se llama 'contarCifras' y devuelve un valor de tipo int (número
	// entero)
	// El parámetro que recibe se llama 'numero' y es un número entero
	public static int contarCifras(int numero) {
		// Inicializamos la variable 'cifras' a 0
		int cifras = 0;

		// Bucle que se repite mientras el número sea mayor que 0
		// En cada repetición, dividimos el número por 10 y aumentamos 'cifras' en 1
		while (numero > 0) {
			numero /= 10; // Dividimos el número por 10 para quitar la última cifra
			cifras++; // Aumentamos 'cifras' en 1
		}

		// Devolvemos el resultado al método main
		return cifras;
	
	}
}
