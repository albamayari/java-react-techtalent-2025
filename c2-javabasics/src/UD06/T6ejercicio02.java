package UD06; // Declaramos el paquete al que pertenece esta clase. Es como una carpeta para organizar el código.

import java.util.Scanner; // Importamos la clase Scanner, que sirve para leer datos del teclado (entrada del usuario).

public class T6ejercicio02 { // Declaramos la clase principal del programa. El nombre debe coincidir con el nombre del archivo.

    // Paso 1:
    // Creamos un método llamado numeroAleatorio que genera un número entero aleatorio
    // entre dos valores (mínimo y máximo), que recibimos como parámetros.
    // Este método se usa porque vamos a necesitar generar varios números y no queremos repetir el mismo código.
    public static int numeroAleatorio(int min, int max) {
        // Math.random() devuelve un número decimal aleatorio entre 0.0 y 1.0 (sin incluir el 1)
        // Multiplicamos ese número por el rango (max - min + 1) para ajustar el tamaño
        // y luego le sumamos 'min' para que el resultado empiece desde el valor mínimo.
        int numero = (int) (Math.random() * (max - min + 1) + min);
        
        // Convertimos el resultado a int con (int), porque Math.random() trabaja con decimales (double)
        // y nosotros queremos números enteros.
        return numero; // Devolvemos el número generado para usarlo en el método main.
    }

    public static void main(String[] args) {
        // Paso 2:
        // Creamos un objeto Scanner para poder leer lo que el usuario escriba por teclado.
        // El objeto se llama 'sc' (puede tener cualquier nombre, pero este es común).
        Scanner sc = new Scanner(System.in);

        // Pedimos al usuario el valor mínimo entre los que quiere generar los números aleatorios.
        System.out.println("Introduce el número mínimo: ");
        int min = sc.nextInt(); // nextInt() sirve para leer un número entero introducido por el usuario.

        // Pedimos el valor máximo
        System.out.println("Introduce el número máximo: ");
        int max = sc.nextInt(); // Guardamos el número máximo.

        // Paso 3:
        // Ahora preguntamos cuántos números aleatorios quiere generar el usuario.
        System.out.println("Introduce la cantidad de números aleatorios que quieres generar: ");
        int cantidad = sc.nextInt(); // Guardamos esa cantidad para usarla en un bucle.

        // Paso 4:
        // Creamos un bucle for que se repita 'cantidad' veces, una vez por cada número aleatorio que queremos generar.
        // 'i' es una variable de control que empieza en 0 y va aumentando hasta que se alcanza la cantidad deseada.
        for (int i = 0; i < cantidad; i++) {

            // Paso 5:
            // En cada repetición del bucle, llamamos (invocamos) al método numeroAleatorio
            // y le pasamos como parámetros los valores mínimo y máximo que introdujo el usuario.
            int numero = numeroAleatorio(min, max); // Guardamos el número generado en una variable llamada 'numero'.

            // Paso 6:
            // Mostramos el número aleatorio generado en la consola.
            System.out.println("Número aleatorio generado: " + numero);
        }

        // Una vez finalizado el bucle, cerramos el objeto Scanner para liberar recursos.
        // Es una buena práctica cerrar los objetos que trabajan con entrada/salida.
        sc.close();
    }
}

