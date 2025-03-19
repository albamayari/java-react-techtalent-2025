package UD05;

import java.util.Scanner;

public class T5ejercicio11 {

    public static void main(String[] args) {
        // Paso 1: Crear un objeto de la clase Scanner.
        // El Scanner es una clase que nos permite leer datos de la consola.
        Scanner sc = new Scanner(System.in);

        // Paso 2: Declarar la variable para almacenar el día de la semana.
        String diaSemana;

        // Paso 3: Bucle do-while para pedir el día de la semana hasta que sea válido.
        // Un bucle do-while se utiliza para repetir un bloque de código al menos una
        // vez y luego repetirlo mientras se cumpla una condición.
        do {
            // Paso 4: Pedir al usuario que introduzca un día de la semana y cambiarlo a
            // minúsculas. Se cambia a minúsculas para que el programa no sea sensible a
            // las mayúsculas.
            System.out.println("Introduce un día de la semana (en minúsculas, por ejemplo: lunes): ");
            diaSemana = sc.nextLine(); // Leer el día de la semana.

            // Paso 5: Convertir a minúsculas.
            // Se hace el cambio a minúsculas antes que el switch porque si no, el programa
            // no funcionará correctamente con entradas en mayúsculas.
            diaSemana = diaSemana.toLowerCase();

            // Paso 6: Usar un switch para determinar si el día es laboral o no.
            // Después de que el usuario introduzca un día de la semana, el programa
            // determinará si el día es laboral o no.

            // El switch es un condicional que se utiliza para tomar decisiones basadas en el
            // valor de una variable.
            // Y case es un bloque de código que se ejecuta si el valor de la variable
            // coincide con el valor especificado en el case.
            switch (diaSemana) {
                case "lunes":
                case "martes":
                case "miércoles":
                case "jueves":
                case "viernes":
                    System.out.println(diaSemana + " es un día laboral.");
                    break; // break es una palabra clave que se utiliza para salir de un bloque de código.
                           // En este caso, se utiliza para salir del switch.
                case "sábado":
                case "domingo":
                    System.out.println(diaSemana + " no es un día laboral.");
                    break; // break es una palabra clave que se utiliza para salir de un bloque de código.
                           // En este caso, se utiliza para salir del switch.

                // default es un bloque de código que se ejecuta si ninguno de los valores de
                // los case coincide con el valor de la variable.
                default:
                    System.out.println("Día no válido. Introduce un día de la semana correcto.");
                    break; // break es una palabra clave que se utiliza para salir de un bloque de código.
                           // En este caso, se utiliza para salir del switch.
            }
        } while (!diaSemana.equals("lunes") && !diaSemana.equals("martes") && !diaSemana.equals("miércoles")
                && !diaSemana.equals("jueves") && !diaSemana.equals("viernes") && !diaSemana.equals("sábado")
                && !diaSemana.equals("domingo")); // Repetir si el día no es válido.

        // Paso 7: Cerrar el Scanner (opcional pero recomendado).
        sc.close();
    }
}