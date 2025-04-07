package UD07;

import java.util.HashMap; // Importamos la clase HashMap para crear un diccionario
import java.util.Map; // Importamos la interfaz Map -- important simpre que quieres hacer un hashmap- sem impornan los 2:hashmapp y map.
import java.util.Scanner; // Importamos la clase Scanner para leer del teclado

public class T7ejercicio01 {

	public T7ejercicio01() {
		// este ejrcico me pide que:Crea una aplicación que calcule la nota media de los
		//alumnos pertenecientes al curso de programación. Una vez
		//calculada la nota media se guardara esta información en un
		//diccionario de datos que almacene la nota media de cada
		//alumno. Todos estos datos se han de proporcionar por
		//pantalla
		
		// Paso 1: Pedimos la cantidad de alumnos 
		System.out.println("Introduce la cantidad de alumnos:");
		Scanner sc = new Scanner(System.in); // Objeto para leer del teclado
		int cantidadAlumnos = sc.nextInt(); // Guardamos la cantidad introducida
		sc.nextLine(); // Limpiamos el salto de línea del buffer para evitar problemas al leer el nombre del alumno
		
		// Paso 2: Creamos un diccionario para almacenar las notas medias
		HashMap<String, Double> notasAlumnos = new HashMap<>(); // Diccionario para almacenar el nombre del alumno y su nota media.
		//el hashMap es una implementación de la interfaz Map que almacena pares clave-valor. 
		//<String, Double> significa que la clave es un String (nombre del alumno) y el valor es un Double (nota media).
		// el hashmap se pone siempre asi para crearlo= <tipo de clave,tipo de valor> nombre del hashmap = new HashMap<>();
		
		// Paso 3: Pedimos los nombres y notas de los alumnos
		for (int i = 0; i < cantidadAlumnos; i++) { // Bucle para pedir los datos de cada alumno
			System.out.printf("Introduce el nombre del alumno %d: ", i + 1); // Pedimos el nombre del alumno. %d es un decimal (entero).
			String nombreAlumno = sc.nextLine(); // Guardamos el nombre introducido

			System.out.printf("Introduce la nota del alumno %s: ", nombreAlumno); // Pedimos la nota del alumno.
			//%s es un String.
			double notaAlumno = sc.nextDouble(); // Guardamos la nota introducida
			sc.nextLine(); // Limpiamos el salto de línea del buffer

		// Paso 4: Calculamos la nota media y la guardamos en el diccionario
			notasAlumnos.put(nombreAlumno, notaAlumno); // Guardamos el nombre y la nota en el diccionario
		    // put() es un método de HashMap que añade un nuevo par clave-valor al diccionario.
			// En este caso, la clave es el nombre del alumno y el valor es su nota.
			
		//Paso 5: Mostramos la nota media de cada alumno
		System.out.printf("La nota media de %s es %.2f%n", nombreAlumno, notaAlumno); // Mostramos la nota media
		// %.2f es un formato para mostrar el número con 2 decimales.
		// %n es un salto de línea.
        }
		// Paso 6: Mostramos todas las notas medias de los alumnos
		System.out.println("Notas medias de los alumnos:");
		for (Map.Entry<String, Double> entry : notasAlumnos.entrySet()) { // Recorremos el diccionario
            String nombre = entry.getKey(); // Obtenemos el nombre del alumno (clave)
            Double nota = entry.getValue(); // Obtenemos la nota media (valor)
            System.out.printf("La nota media de %s es %.2f%n", nombre, nota); // Mostramos el resultado
        }
		// Paso 7: Cerramos el Scanner (buena práctica)
		sc.close(); // Cerramos el Scanner para liberar recursos
		// El Scanner es un objeto que se utiliza para leer la entrada del usuario desde la consola.
		// Es una buena práctica cerrarlo cuando ya no lo necesitamos para evitar fugas de memoria.
		// En este caso, cerramos el Scanner al final del programa, después de haber leído todos los datos.
		
	    // Paso 8: Fin del programa
		// El programa termina aquí. No es necesario añadir nada más.
		
	}
		
	}

}
