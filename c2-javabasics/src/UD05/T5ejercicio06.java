package UD05;
import java.util.Scanner; 
public class T5ejercicio06 {

	public static void main(String[] args) {
		// Tenemos que plantear un programa que le añada el IVA a un producto. EL IVA será fijo del 21%. Nos pide que leamos el precio por el teclado, es decir, que usemos la clase Scanner. 
		//Si por ejemplo introducimos 100, el programa nos mostrará por pantalla el precio final (121).
		
		//Tenemos que tener el cuenta que el precio del producto puede tener decimales. Entonces, tenemos que usar la clase double envez de la clase int.
		
		//Paso 1: Importar la clase Scanner
		//el import sismpre se ha de hacer antes de la clase principal es decir antesde poner public class T5ejercicio06 porque si no, no funcionará porque no reconocerá la clase Scanner.
	
		//Paso 2: Crear un objeto de la clase Scanner
		Scanner sc = new Scanner(System.in); 
		//creamos un objeto de la clase Scanner para leer el precio del producto, y lo llamamos sc porque es la convención. Ponemos new scanner para que el objeto pueda leer desde la consola.
		//Y ponemos (System.in) para ...
		
		//Paso 3: Leer el precio del producto
		System.out.println("Introduce el precio del producto: "); //le pedimos al usuario que introduzca el precio del producto
		
		//Paso 4: Calcular el precio final
		double precio = sc.nextDouble(); //leemos el precio del producto y lo guardamos en la variable precio. Ponemos nextDouble porque es un número decimal. el nextInt es para números enteros.
		//Este paso es importante porque necesitamos el precio del producto para calcular el IVA. No nos podemos passar este paso porque si no, no podemos calcular el IVA ya que no tenemos el precio del producto.
		//Este paso nos ayuda a decirle al programa que el precio del producto es el que el usuario introdujo en la consola ya que tiene sc de scanner, es decir, que el precio del producto es el que el usuario introdujo en la consola.
		
		//Paso 5: Mostrar el precio final
		double iva = precio * 0.21; //calculamos el IVA del producto. Multiplicamos el precio por 0.21 para obtener el 21% de IVA.
		
		// Cerrar el Scanner (opcional pero recomendado)
        sc.close();

	}

}
