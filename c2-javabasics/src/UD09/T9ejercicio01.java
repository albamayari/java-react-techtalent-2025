package UD09;

public class T9ejercicio01 {
	
private int preciobase;
private String color;
private char consumoenergetico;
private double peso;


//creamos el constructor por defecto
public T9ejercicio01() { //no se pone class en este caso porque ye lo has definido arriba.
	//Los que son por defecto no hace falta volver a repetir el nombre/o lo quees  para que se guarde.

this.preciobase = 100;
this.color = "blanco";
this.consumoenergetico = 'F'; //solo una comilla porque es un char y no un String
this.peso = 5;

}
//cramos un constructor con atributos precio y peso. 
public T9ejercicio01(int preciobase,double peso) {  
this.preciobase = preciobase;
this.peso = peso;

}
}
 




//"blanco","negro","rojo","azul","gris";