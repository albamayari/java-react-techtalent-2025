package UD06;

import java.util.Scanner;

public class T6ejercicio07 {

    public static void main(String[] args) {
        // Este ejercicio me pide que: cree una aplicación que convierta una cantidad de euros a otra moneda (dólares, yenes o libras).
        // El método que hace la conversión no debe devolver nada (void), solo mostrar el mensaje del resultado.

        // Paso 1: Pedimos la cantidad en euros
        System.out.println("Introduce una cantidad de euros:");
        Scanner sc = new Scanner(System.in); // Objeto para leer del teclado
        double euros = sc.nextDouble(); // Guardamos la cantidad introducida
        sc.nextLine(); // Limpiamos el salto de línea del buffer

        // Paso 2: Pedimos la moneda de destino
        System.out.println("Introduce la moneda a la que quieres convertir (dólares, yenes o libras):");
        String moneda = sc.nextLine(); // Guardamos la moneda introducida
        sc.close(); // Cerramos el Scanner

        // Paso 3: Llamamos al método que hace la conversión
        convertirDivisa(euros, moneda); // Le pasamos los dos datos: euros y la moneda
    }

    // Paso 4: Método que hace la conversión de euros a la moneda indicada
    // Este método es void porque no devuelve ningún resultado, solo muestra el mensaje
    public static void convertirDivisa(double euros, String moneda) {
        double resultado = 0; // Aquí guardaremos el resultado de la conversión

        // Convertimos la moneda a minúsculas para que no haya errores por mayúsculas
        switch (moneda.toLowerCase()) {
            case "dólares":
                resultado = euros * 1.28611;
                System.out.printf("%.2f euros son %.2f dólares.%n", euros, resultado);
                break;
            case "yenes":
                resultado = euros * 129.852;
                System.out.printf("%.2f euros son %.2f yenes.%n", euros, resultado);
                break;
            case "libras":
                resultado = euros * 0.86;
                System.out.printf("%.2f euros son %.2f libras.%n", euros, resultado);
                break;
            default:
                System.out.println("Moneda no válida. Por favor, introduce 'dólares', 'yenes' o 'libras'.");
        }
    }
}
