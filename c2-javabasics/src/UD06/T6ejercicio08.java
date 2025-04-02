package UD06;

import java.util.Scanner;

public class T6ejercicio08 {

    public static void main(String[] args) {
        // Este ejercicio me pide: crear un array de 10 números introducidos por teclado.
        // Luego mostrar por pantalla el índice y su valor.
        // Debo hacer dos métodos: uno para rellenar el array y otro para mostrarlo.

        int[] numeros = new int[10]; // Paso 1: Creamos un array de 10 posiciones

        rellenarArray(numeros);     // Paso 2: Rellenamos el array con valores del usuario
        mostrarArray(numeros);      // Paso 3: Mostramos el contenido del array
    }

    // Paso 4: Método para rellenar el array
    public static void rellenarArray(int[] numeros) {
        Scanner sc = new Scanner(System.in); // Creamos el Scanner para leer del teclado

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introduce el valor para la posición %d: ", i);
            numeros[i] = sc.nextInt(); // Guardamos cada valor en la posición correspondiente
        }

        sc.close(); // Cerramos el Scanner (buena práctica)
    }

    // Paso 5: Método para mostrar el contenido del array
    public static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("En la posición %d está el valor %d.%n", i, numeros[i]);
        }
    }
}
