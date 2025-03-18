package UD05;

public class T5ejercicio07 {
	
	public static void main(String[] args) {
    //EL ejercicio me pide que Muestra los números del 1 al 100 (ambos incluidos). el ejercio me pide que use un bucle while    
		
	//Paso 1- Declarar una variable entera para el bucle while es decir un contador que empiece en 1 y se llame interador. Un interador es una variable que se utiliza para contar el número de veces que se ejecuta un bucle.
		//La palabra  interador vine de la palabra inglesa "iterator" que significa "iterador" en español que signfica "recorrer" en español.
	
		int interador=1;
	//Paso 2- Crear un bucle while que imprima los números del 1 al 100.
		while (interador<=100) {
			
	//Paso 3- Mostrar el número actual del interador.
			System.out.println(interador);
			
	//Paso 4- Incrementar el valor del interador en 1.
        interador++; // interador++ es lo mismo que interador = interador + 1; es decir, incrementa el valor de interador en 1. 
     //El bucle while se ejecutará mientras que el valor del interador sea menor o igual a 100. Si el valor del interador es mayor que 100, el bucle while se detendrá y el programa terminará.
}
}
}