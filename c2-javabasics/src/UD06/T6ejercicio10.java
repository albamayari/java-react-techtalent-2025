package UD06;

import java.util.Scanner;

public class T6ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Paso 1: Pedimos el tamaño del array
        System.out.print("¿Cuántos números quieres en el array? ");
        int tamaño = sc.nextInt();

        // Paso 2: Creamos el array con ese tamaño
        int[] array = new int[tamaño];

        // Paso 3: Pedimos los valores mínimo y máximo entre los que generar los números aleatorios
        System.out.print("Introduce el número mínimo: ");
        int min = sc.nextInt();

        System.out.print("Introduce el número máximo: ");
        int max = sc.nextInt();

        // Paso 4: Rellenamos el array con números aleatorios PRIMOS entre min y max
        rellenarArrayConPrimos(array, min, max);

        // Paso 5: Mostramos el array y buscamos el mayor
        mostrarArrayYMayor(array);

        sc.close();
    }

    // Método que devuelve true si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Método para rellenar un array con números aleatorios primos entre min y max
    public static void rellenarArrayConPrimos(int[] array, int min, int max) {
        for (int i = 0; i < array.length; ) {
            int aleatorio = (int) (Math.random() * (max - min + 1) + min);
            if (esPrimo(aleatorio)) {
                array[i] = aleatorio;
                i++; // Solo avanzamos si encontramos un primo
            }
        }
    }

    // Método para mostrar el array y el número mayor
    public static void mostrarArrayYMayor(int[] array) {
        int mayor = array[0];
        System.out.println("Array de números primos:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Posición %d: %d%n", i, array[i]);
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        System.out.println("El número primo más alto es: " + mayor);
    }
}
