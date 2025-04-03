package UD06;
import java.util.Scanner;
public class T6ejercicio09 {
	public static void main(String[] args) {
		//Crea un array de números donde le indicamos por teclado el tamaño del array,
		//rellenaremos el array con números aleatorios entre 0 y 9. Al final muestra por pantalla el
		//valor de cada posición y la suma de todos los valores.
		//Tareas a realizar: Haz un método para rellenar el array(que tenga como parámetros los
		//números entre los que tenga que generar) y otro para mostrar el contenido y la suma del array.
		
		//primer paso - creamos la array. Para ello tenemos que poner el tipo de datos y el tamaño.
		//Un array es un objeto, por lo que se crea con new.
		int numeros[] = new int[10]; //creamos un array de 10 posiciones y new int[10] crea un array de 10 posiciones.
		numeros = rellenarArray(numeros); //llamamos al método rellenarArray y le pasamos el array numeros.
		//segundo paso - rellenamos el array con valores del usuario. Para ello, creamos un método que se llame rellenarArray. 
		//creamos un metodo para rellenar el array. Para ello, tenemos que crear un método que se llame rellenarArray.
		
		
	} //fin del main- este parentesis se usa para cerrar el método main y poder empezar con otros métodos.
	public static int[] rellenarArray (int[] numeros1) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros1.length; i++) {
            System.out.printf("Introduce el valor para la posición %d: ", i);
            numeros1[i] = sc.nextInt();
        }
		return numeros1;
	}
}
