package UD05;

public class T5ejercicio10 {
// Realiza una aplicación que nos pida un número de ventas a introducir, después nos
	pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final
	mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no
//primero necesito un INPUT de ususario. el primer numero es el numero de ventas.
	//-significa quantas veces te pide el precio.
	int cuantasventas = 1;
	cuantasventas=JOptionPane.showInputDialog("Introduce el numero de ventas");
	int ventas=interger.parseInt(cuantasventas);
	 
	//Segunda etapa, entro en un bucle de pedir el total de cada ventas.
		//significa el total que queremos sumar
	for(int i = 0 <= ventas;i++)
	{
		string totalventa =""; //variable de total de ventas
		totalventa=JOptionPane.showInputDialog("Introduce el valor";
		+ "total de la venta " + i);
		
		valor+= Integer.parseInt(totalventa);
		//integer.parseInt es para convertir el string en integer. 
		//Eso quiere decir que el valor de totalventa es un string (una string es un texto) y lo convertimos en un numero entero.
	System.out.println("El total de ventas es: " + valor);
	
	//Se puede convinar el Joption panel, el scanner y el syso.out.println. aunque confunde un poco al ususario ya que no sabe donde mirar. 
	//si tines un scaner se lo muestras por  la pantalla)
	}
}
