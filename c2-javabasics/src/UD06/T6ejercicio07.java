package UD06;
//introduce un scaneer
import java.util.Scanner;

public class T6ejercicio07 {

	public static void main(String[] args) {
		// Este ejercicio me pide que: Crea un aplicación que nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dolares, yenes o libras.
		//El método tendrá como parámetros, la cantidad de euros y la moneda a pasar que sera una cadena, este no devolverá ningún valor, mostrara un mensaje indicando el cambio (void).
		//El void es porque no devuelve ningún valor y esto sirve para mostrar un mensaje ya que no se necesita devolver nada. Si no se pone void, se espera que devuelva algo como un int o un boolean.
		//El cambio de divisas es: 1 euro = 1.28611 dólares, 1 euro = 129.852 yenes y 1 euro = 0.86 libras.
		
		// Paso 1: Pedir una cantidad de euros al usuario
		System.out.println("Introduce una cantidad de euros: "); // Mostramos mensaje en consola
		
		// Creamos un objeto Scanner para leer lo que el usuario escribe
		Scanner sc = new Scanner(System.in);	
		double euros = sc.nextDouble(); // Guardamos en la variable 'euros' el valor introducido por el usuario
		sc.nextLine(); // Limpiamos el buffer de teclado
		
		// Paso 2: Pedir la moneda a la que se quiere convertir
		System.out.println("Introduce la moneda a la que quieres convertir (dólares, yenes o libras): ");
		String moneda = sc.nextLine(); // Guardamos la moneda introducida por el usuario
		sc.close(); // Cerramos el Scanner (buena práctica en Java cuando ya no lo usamos)
		
		// Paso 3: Llamamos al método que hace la conversión
		// Usamos un método que se llama convertirDivisa y no devuelve ningún valor (void). Este método recibe dos parámetros: la cantidad de euros y la moneda. 
		// Este método mostrará un mensaje con el resultado en lugar de devolverlo. 
		convertirDivisa(euros, moneda); // Llamamos al método y le pasamos los parámetros 'euros' y 'moneda'
		
		// Paso 4: Método que convierte una cantidad de euros a otra moneda
		// Este método se llama 'convertirDivisa' y no devuelve ningún valor (void)
		// Recibe dos parámetros: la cantidad de euros y la moneda a la que se quiere convertir
		public static void convertirDivisa(double euros, String moneda) {
            // Inicializamos la variable 'resultado' a 0, que es el valor por defecto y sirbe para que no haya errores.
            double resultado = 0;
            
            // Usamos un condicional switch para decidir qué conversión hacer
            switch (moneda) {
                case "dólares": // Si la moneda es "dólares", hacemos la conversión a dólares
                    resultado = euros * 1.28611; // 1 euro = 1.28611 dólares
                    System.out.printf("%.2f euros son %.2f dólares.%n", euros, resultado); // Mostramos el resultado
                    break; // Salimos del switch
                case "yenes": // Si la moneda es "yenes", hacemos la conversión a yenes
                    resultado = euros * 129.852; // 1 euro = 129.852 yenes
                    System.out.printf("%.2f euros son %.2f yenes.%n", euros, resultado); // Mostramos el resultado
                    break; // Salimos del switch
                case "libras": // Si la moneda es "libras", hacemos la conversión a libras
                    resultado = euros * 0.86; // 1 euro = 0.86 libras
                    System.out.printf("%.2f euros son %.2f libras.%n", euros, resultado); // Mostramos el resultado
                    break; // Salimos del switch
                default: // Si la moneda no es ninguna de las anteriores, mostramos un mensaje de error
                    System.out.println("Moneda no válida. Por favor, introduce 'dólares', 'yenes' o 'libras'.");
                    
                
                    
            }
        }
		
		
		
		
		

	}

}
