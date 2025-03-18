package UD05;

public class T5ejercicio08 {

	public static void main(String[] args) {
		// Este ejercicio me pide que haga el ejecio anterior(T5ejercicio7) pero con un bucle for en vez de un bucle while.
		
		// El bucle for es una estructura de control que se utiliza para repetir un bloque de código un número fijo de veces. En palabras faciles, el bucle for se utiliza para ejecutar un bloque de código un número determinado de veces.
		
		//A diferencia del bucle while, el bucle for tiene una inicialización, una condición de terminación y una expresión de incremento o decremento.
		
		// El bucle for se utiliza cuando se conoce el número de iteraciones que se van a realizar. 
		//Por ejemplo, si queremos mostrar los números del 1 al 100 en la consola, podemos utilizar un bucle for. Para ello, vamos a seguir los siguientes pasos:
		
		// Paso 1: Crear un bucle for que imprima los números del 1 al 100.
		
		int iterador=1; //declaramos una variable entera para el bucle for que empiece en 1 y se llame interador.
		
		//Paso 2: Crear un bucle for que imprima los números del 1 al 100.
		for (iterador = 1; iterador <= 100; iterador++) { // se pone { al final porque es un bloque de código que se va a repetir y para que el programa sepa donde empieza y donde termina el bloque de código.
			
			// El bucle for se ejecutará mientras que la condición sea verdadera. 
			//En este caso, la condición es que el valor del interador sea menor o igual a 100.
			// Si el valor del interador es mayor que 100, el bucle for se detendrá y el programa terminará.
		
		
		// Paso 3: Mostrar el número actual del iterador.
	
		System.out.println(iterador);
			
			
		}
	}

}
