package UD06;

import java.util.Scanner;

public class T6ejercicio05 {

    public static void main(String[] args) {
        // Este ejercicio me pide que convierta un número decimal a binario.

        // Paso 1: Pedimos al usuario un número decimal
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        int numeroDecimal = sc.nextInt();
        sc.close();

        // Paso 2: Llamamos al método que convierte a binario
        String binario = convertirABinario(numeroDecimal);

        // Paso 3: Mostramos el resultado
        System.out.println("El número " + numeroDecimal + " en binario es: " + binario);
    }

    // Método que convierte un número decimal a binario
    // Recibe un int y devuelve un String con el número en binario
    public static String convertirABinario(int numero) {
        // Creamos una variable tipo String para ir guardando el binario (al revés)
        String binario = "";

        // Si el número es 0, el binario es "0"
        if (numero == 0) {
            return "0";
        }

        // Mientras el número sea mayor que 0
        while (numero > 0) {
            int resto = numero % 2; // Obtenemos el resto de dividir entre 2 (0 o 1)
            binario = resto + binario; // Añadimos ese bit al principio del String
            numero = numero / 2; // Dividimos el número entre 2
        }

        return binario; // Devolvemos el número convertido a binario como texto
    }


}
