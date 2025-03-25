package UD06;

import java.util.Scanner;

public class T6ejercicio03 {

    public static void main(String[] args) {
        // Paso 1: Pedimos un número por teclado
        System.out.println("Introduce un número: ");
        Scanner sc = new Scanner(System.in); // Creamos el objeto Scanner
        int numero = sc.nextInt(); // Leemos el número introducido
        sc.close(); // Cerramos el Scanner (buena práctica)

        // Paso 2: Llamamos al método que determina si el número es primo
        boolean esPrimo = esPrimo(numero); // Guardamos el resultado (true o false)

        // Paso 3: Mostramos el resultado por pantalla según el valor devuelto
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }

    // Paso 4: Creamos el método que comprueba si un número es primo
    // Este método recibe un número entero como parámetro y devuelve true si es primo, false si no.
    public static boolean esPrimo(int numero) {
        // Casos especiales: 0 y 1 no son primos
        if (numero <= 1) {
            return false;
        }

        // Recorremos desde 2 hasta el número anterior al dado (numero - 1)
        // Si encontramos un divisor exacto, no es primo
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; // Si es divisible entre i, no es primo
            }
        }

        // Si termina el bucle sin encontrar divisores, es primo
        return true;
    }
}
