package UD06; // Esto indica que este archivo pertenece al paquete UD06, que es como una carpeta de organización en Java.

import java.util.Scanner; // Importamos la clase Scanner, que permite leer datos que el usuario introduce por teclado.

/*
 * Este ejercicio me pide:
 * 1. Pedir un número al usuario.
 * 2. Pasar ese número a un método.
 * 3. El método debe indicar si ese número es primo o no, devolviendo true o false.
 * 4. Mostrar el resultado por pantalla.
 * 
 * Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
 * Por ejemplo: 2, 3, 5, 7, 11, 13 son números primos.
 */

public class T6ejercicio03 { // Declaramos la clase principal. Debe tener el mismo nombre que el archivo Java.

    public static void main(String[] args) {
        // Paso 1: Pedimos un número por teclado
        System.out.println("Introduce un número: "); // Mostramos mensaje en consola

        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer lo que el usuario escribe
        int numero = sc.nextInt(); // Guardamos en la variable 'numero' el valor introducido por el usuario
        sc.close(); // Cerramos el Scanner (buena práctica en Java cuando ya no lo usamos)

        // Paso 2: Llamamos al método que comprueba si es primo
        // Usamos un método que se llama esPrimo y devuelve un booleano (true o false)
        // Esto es lo que tus notas llaman “llamar a un condicional”: en realidad es llamar a un MÉTODO que devuelve un booleano
        boolean resultado = esPrimo(numero); // Guardamos el resultado (true o false) en la variable 'resultado'

        // Paso 3: Mostramos el resultado por pantalla
        // Aquí usamos un if (condicional) para decidir qué mensaje mostrar
        if (resultado) {
            // Si resultado es true (es primo), mostramos este mensaje
            System.out.printf("El número %d es primo.%n", numero); // %d es un marcador de formato para números enteros
        } else {
            // Si resultado es false (no es primo), mostramos este mensaje
            System.out.printf("El número %d no es primo.%n", numero);
        }
    }

    // Paso 4: Método que comprueba si un número es primo
    // Este método se llama 'esPrimo' y devuelve un valor de tipo boolean (true o false)
    // El parámetro que recibe se llama 'numero' y es un número entero
    public static boolean esPrimo(int numero) {
        // Según la definición matemática, el 0 y el 1 NO son primos
        if (numero <= 1) {
            return false; // Si es 0 o 1, devolvemos false directamente
        }

        // Recorremos desde 2 hasta la raíz cuadrada del número (inclusive)
        // Esto es una forma eficiente de comprobar si el número tiene divisores
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            // Si el número es divisible por otro número distinto de 1 o él mismo
            if (numero % i == 0) {
                return false; // No es primo si tiene otro divisor
            }
        }

        // Si el bucle termina y no encontramos divisores, el número es primo
        return true; // Devolvemos true si es primo

        /*
         * Tus notas dicen:
         * “Siempre ha de haber un return siempre que haya un método como boolean”
         * ✔ Correcto: cuando un método devuelve algo (como boolean), SIEMPRE debe tener un 'return'.
         * 
         * También decías:
         * “Si el número se puede dividir entre 2 o su raíz cuadrada no da 0, no es primo”
         * ❌ Cuidado: eso no es del todo correcto. No importa si la raíz cuadrada da 0 o no;
         * lo importante es que NO tenga divisores exactos entre 2 y su raíz cuadrada.
         */
    }
}
