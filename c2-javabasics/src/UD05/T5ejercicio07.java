package UD05;

public class T5ejercicio07 {
	
	public static void main(String[] args) {
    //EL ejercicio me pide que Muestra los números del 1 al 100 (ambos incluidos). el ejercio me pide que use un bucle while   
		//while es una estructura de control que se utiliza para repetir un bloque de código mientras se cumple una condición. La condición se evalúa antes de ejecutar el bloque de código. Si la condición es verdadera, el bloque de código se ejecuta. Si la condición es falsa, el bloque de código no se ejecuta y el programa continúa con la instrucción siguiente después del bucle while.
		//Es decir, el bucle while se ejecutará mientras que la condición sea verdadera. Por lo tanto, es importante asegurarse de que la condición se vuelva falsa en algún momento para evitar un bucle infinito.Como ejemplo de bucle while, vamos a mostrar los números del 1 al 100 en la consola. Para ello, vamos a seguir los siguientes pasos:
		
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