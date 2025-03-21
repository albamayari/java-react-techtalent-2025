package UD06; // Esto indica en qué paquete está este archivo Java. Es como una carpeta para organizar tu código.

import java.util.Scanner; // Importamos la clase Scanner, que sirve para leer lo que el usuario escribe por teclado.

public class T6ejercicio01 { // Declaramos una clase pública llamada T6ejercicio01. El nombre del archivo debe ser igual.

    // Este es el método principal que se ejecuta cuando iniciamos el programa
    public static void main(String[] args) {
        
        // Creamos un objeto de la clase Scanner para poder leer datos del usuario por consola.
        Scanner sc = new Scanner(System.in);

        // Mostramos un menú por pantalla para que el usuario elija una figura
        System.out.println("Seleccione la figura de la que quiere calcular el área: ");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Cuadrado");

        // Guardamos en la variable 'figura' la opción que el usuario escribe
        int figura = sc.nextInt(); // nextInt() lee un número entero introducido por el usuario

        // Usamos un switch para ejecutar una parte del código según la opción elegida por el usuario
        switch(figura) {
            case 1: // Si el usuario elige "1", significa que quiere calcular el área de un círculo
                System.out.println("Introduzca el radio del círculo: "); // Pedimos el radio
                double radio = sc.nextDouble(); // Leemos el valor que introduce el usuario y lo guardamos como 'radio'
                
                // Llamamos al método que calcula el área del círculo y guardamos el resultado
                double areaCirculo = areaCirculo(radio);
                
                // Mostramos el área calculada
                System.out.println("El área del círculo es: " + areaCirculo);
                break; // Salimos del switch

            case 2: // Si el usuario elige "2", significa que quiere calcular el área de un triángulo
                System.out.println("Introduzca la base del triángulo: "); // Pedimos la base
                double base = sc.nextDouble(); // Leemos la base

                System.out.println("Introduzca la altura del triángulo: "); // Pedimos la altura
                double altura = sc.nextDouble(); // Leemos la altura

                // Llamamos al método que calcula el área del triángulo
                double areaTriangulo = areaTriangulo(base, altura);
                
                // Mostramos el área calculada
                System.out.println("El área del triángulo es: " + areaTriangulo);
                break;

            case 3: // Si el usuario elige "3", significa que quiere calcular el área de un cuadrado
                System.out.println("Introduzca el lado del cuadrado: "); // Pedimos el lado
                double lado = sc.nextDouble(); // Leemos el valor del lado
                
                // Llamamos al método que calcula el área del cuadrado
                double areaCuadrado = areaCuadrado(lado);

                // Mostramos el resultado
                System.out.println("El área del cuadrado es: " + areaCuadrado);
                break;

            default: // Si el usuario escribe un número que no es 1, 2 o 3
                System.out.println("La figura seleccionada no es correcta."); // Mostramos mensaje de error
                break;
        }

        // Cerramos el Scanner. Es buena práctica cerrar los recursos que usamos.
        sc.close();
    }

    // Este método calcula el área de un círculo a partir de su radio
    public static double areaCirculo(double radio) {
        // Fórmula: (radio ^ 2) * PI. Math.pow eleva al cuadrado y Math.PI es el valor de π
        return Math.pow(radio, 2) * Math.PI;
    }

    // Este método calcula el área de un triángulo a partir de base y altura
    public static double areaTriangulo(double base, double altura) {
        // Fórmula: (base * altura) / 2
        return (base * altura) / 2;
    }

    // Este método calcula el área de un cuadrado a partir de un lado
    public static double areaCuadrado(double lado) {
        // Fórmula: lado * lado
        return lado * lado;
    }
}