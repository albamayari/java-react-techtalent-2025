package UD06;
import java.util.Scanner; // Importamos la clase Scanner para poder leer datos desde el teclado

// Declaramos la clase principal. Su nombre debe coincidir con el nombre del archivo.
public class T6ejercicio04 {

    public static void main(String[] args) {
        //  EL ENUNCIADO DICE:
        // Crear una aplicación que:
        // 1. Pida un número por teclado
        // 2. Llame a un método que calcule su factorial
        // 3. Muestre el resultado

        // Paso 1: Mostrar mensaje y pedir número
        System.out.println("Introduce un número: "); // Esto se imprime por pantalla para que el usuario sepa qué debe hacer

        // Paso 2: Crear objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in); // Scanner permite leer lo que el usuario escriba por consola

        // Paso 3: Guardar el número que ha escrito el usuario en una variable
        int numero = sc.nextInt(); // nextInt() lee un número entero introducido por el usuario

        // Paso 4: Cerrar el Scanner (es buena práctica en Java)
        sc.close();

        // Paso 5: Llamar al método que calcula el factorial, pasándole el número como parámetro
        int resultado = calcularFactorial(numero); // Guardamos el resultado del método en la variable 'resultado'

        // Paso 6: Mostrar el resultado por pantalla con printf (formateado)
        // %d es para imprimir un número entero, %n es un salto de línea
        System.out.printf("El factorial de %d es %d.%n", numero, resultado);
    }

    // MÉTODO QUE CALCULA EL FACTORIAL
    // Este método se llama 'calcularFactorial'
    // Recibe un número entero 'n' como parámetro
    // Devuelve el resultado del factorial (también un entero)
    public static int calcularFactorial(int numero) {
        int factorial = 1; // Empezamos en 1 porque el factorial siempre empieza multiplicando por 1

        // Bucle que va desde 1 hasta n
        // En cada paso, multiplicamos el valor actual del factorial por el número 'i'
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Esto es igual que: factorial = factorial * i
        }

        // Devolvemos el resultado al método main
        return factorial;

        /*Como dicen tus notas:
         * “Siempre ha de haber un return en un método como boolean o int”
         * --en este caso, el método devuelve un int, por eso usamos 'return factorial'
         */
    }
}
