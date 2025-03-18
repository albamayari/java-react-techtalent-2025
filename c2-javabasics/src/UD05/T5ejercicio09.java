package UD05;

public class T5ejercicio09 {

	public static void main(String[] args) {
		// me pide que haga el ejercicio anterior (T5ejercicio8) pero muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
		// En este caso, vamos a utilizar un bucle for para mostrar los números del 1 al 100 que son divisibles entre 2 y 3. Utilizamos el bucle for porque conocemos el número de iteraciones que se van a realizar ya que queremos mostrar los números del 1 al 100.
		//Para ello, vamos a seguir los siguientes pasos:
		
		// Paso 1: Crear un bucle for que imprima los números del 1 al 100 divisibles entre 2 y 3.
			
		int iterador=1; //declaramos una variable entera para el bucle for que empiece en 1 y se llame interador.
		
		//Paso 2: Crear un bucle for que imprima los números del 1 al 100 divisibles entre 2 y 3.
		
		for (iterador = 1; iterador <= 100; iterador++) { // se pone { al final porque es un bloque de código que se va a repetir y para que el programa sepa donde empieza y donde termina el bloque de código.
            
            // El bucle for se ejecutará mientras que la condición sea verdadera. 
            //En este caso, la condición es que el valor del interador sea menor o igual a 100.
            // Si el valor del interador es mayor que 100, el bucle for se detendrá y el programa terminará.
			
	    // Paso 3: Comprobar si el número actual del interador es divisible entre 2 y 3. 
			//Para ello, utilizamos el operador módulo (%) que devuelve el resto de la división entre dos números.
			//El simbolo % se llama operador módulo que el nombre procede del latín "modulus" que significa "resto" en español.
			//El simbolo % y se utiliza para obtener el resto de la división entre dos números.
			//Es decir, si el resto de la división es cero, el número es divisible entre los dos números. 
		
		if (iterador % 2 == 0 && iterador % 3 == 0) { 
			// si el número actual del interador es divisible entre 2 y 3, entonces se ejecuta el bloque de código que está dentro de las llaves.
			//El operador && se llama operador lógico AND que significa "y" en español. Operador significa que se utiliza para combinar dos expresiones lógicas y devuelve verdadero si ambas expresiones son verdaderas.
			//Operador la palabra vine de la palabra inglesa "operator" que significa "operador" en español.
			//Lo llamamos operador ya que se utiliza para realizar operaciones lógicas, es decir, para combinar dos expresiones logicas y devolver un resultado.
			//Operador lógico AND se utiliza para combinar dos expresiones lógicas y devuelve verdadero si ambas expresiones son verdaderas.
			
			//El operador == se llama operador de igualdad y se utiliza para comparar dos valores. Devuelve verdadero si los valores son iguales y falso si los valores son diferentes.
			//El operador && se llama operador lógico AND que significa "y" en español. Se utiliza para combinar dos expresiones lógicas y devuelve verdadero si ambas expresiones son verdaderas.
		
            
            // Paso 4: Mostrar el número actual del interador.
            System.out.println(iterador);
						}
            
					}

				}
		}