package UD05;
import java.util.Scanner;

public class T5ejercicio10 {
 // El el ercicio me pide que realize una aplicación que nos pida un número de ventas a introducir.
	//después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
	//Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
	
	//Planteamineto: El ejercicio en palabras simples me esta pidiendo que realice un programa que me pida un número de ventas a introducir. Después me pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final, mostrará la suma de todas las ventas.
	//El ejercico me pide por teclado las ventas, es decir, que use la clase Scanner.- Si no es escaner es un pop up que se llama JOptionPane, pero en este caso es Scanner. 
	// Importante de recordar,-- SI queremos usar un scanner, tenemos que importar la clase Scanner. Lo haremos antes de la clase principal, es decir, antes de poner public class T5ejercicio10 ya que si no, no funcionará porque no reconocerá la clase Scanner.
	
	//Despues para acabar el ejercicio --me pide que muestre la suma de todas las ventas, es decir, que use la clase System.out.println.
	
	//Para resolver este ejercicio, vamos a planear el ejercico en los siguientes pasos:
	
	//Paso 1: Importar la clase Scanner- se pone simpre arriba de la clase principal
	
	//Paso 2: Crear un objeto de la clase Scanner, es decir, un objeto que me permita leer las ventas por teclado/consola.
	Scanner sc = new Scanner(System.in);
	//En este caso, hemos creado un objeto de la clase Scanner llamado sc que nos permitirá leer las ventas por teclado. Hemos usado new Scanner(System.in) para que el objeto pueda leer desde la consola. 
	//(System.in) indica que el objeto leerá desde la consola. Si quisieramos leer desde un archivo, usaríamos (System.out), es decir, que el objeto leerá desde un archivo.
	
	//Paso 3: Pedir al usuario que introduzca el número de ventas a introducir.
	System.out.println("Introduce el número de ventas a introducir: ");
	
	//Paso 4: Leer el número de ventas que el usuario introdujo en la consola. Para ello, guardamos el número de ventas en una variable llamada numVentas. Despues, usamos el método nextInt() para leer un número entero. 
	//El método nextInt() lee un número entero de la consola. Un metodo es un bloque de código que se ejecuta cuando se llama, en este caso, el método nextInt() se ejecutará cuando se llame.
	// sc es el objeto de la clase Scanner que hemos creado anteriormente.
	//nextInt significa next integer, es decir, que lee un número entero. Si quisieramos leer un número decimal, usaríamos nextDouble.
	int numVentas = sc.nextInt();
	
	//Paso 5: Crear una variable para almacenar la suma de todas las ventas. En este caso, la variable se llamará sumaVentas y la inicializaremos a 0.
	//Inicializar una variable significa asignarle un valor inicial. En este caso, hemos inicializado la variable sumaVentas a 0.
	
	int sumaVentas = 0;
	
	//Paso 6: Crear un bucle for para pedir al usuario que introduzca las ventas. El bucle se repetirá tantas veces como el número de ventas que el usuario introdujo en la consola.
	//Para ello, usamos la variable numVentas que contiene el número de ventas que el usuario introdujo en la consola.
	//En cada iteración del bucle, pedimos al usuario que introduzca una venta y la sumamos a la variable sumaVentas.
	//Al final del bucle, la variable sumaVentas contendrá la suma de todas las ventas.
	
	for(
	int i = 1;i<=numVentas;i++)
	{
        System.out.println("Introduce la venta " + i + ": ");
        int venta = sc.nextInt();
        sumaVentas = sumaVentas + venta;
    }
	
	//Paso 7: Mostrar la suma de todas las ventas en la consola.
	System.out.println("La suma de todas las ventas es: " + sumaVentas);
	
	//Paso 8: Cerrar el Scanner (opcional pero recomendado).
	sc.close();
	}
}
//El bucle for se utiliza cuando se conoce el número de iteraciones que se van a realizar. Es decir, se sabe cuántas veces se va a repetir el bucle antes de que com
//El bucle for se compone de tres partes: la inicialización, la condición y la actualización. La inicialización se ejecuta una vez al principio del bucle y se utiliza para inicializar la variable de control. La condición se evalúa antes de cada iteración y se utiliza para determinar si se debe continuar o no. La actualización se ejecuta al final de cada iteración y se utiliza para actualizar la variable de control.
//En este caso, la variable de control es i, que se inicializa a 1, se evalúa si i es menor o igual al número de ventas introducido por el usuario y se actualiza i en cada iteración.
//Dentro del bucle, pedimos al usuario que introduzca una venta y la sumamos a la variable sumaVentas. Al final del bucle, la variable sumaVentas contendrá la suma de todas las ventas.
//Finalmente, mostramos la suma de todas las ventas en la consola y cerramos el Scanner
//El bucle for es una estructura de control que se utiliza para repetir un bloque de código un número fijo de veces. La condición del bucle for se evalúa antes de cada iteración y se utiliza para determinar si se debe continuar o no. Si la condición es verdadera, el bloque de código se ejecuta. 
//Si la condición es falsa, el bloque de código no se ejecuta y el programa continúa con la instrucción siguiente después del bucle for.

	