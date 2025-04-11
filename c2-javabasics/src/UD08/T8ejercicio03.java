package UD08;

public class T8ejercicio03 {
//primer paso- ponemos los atributos  de la clase antes de volver a poner el numero del ejercicio.
	//en este caso no se pone el private porque no es necesario. Aqui creamos los atributos de la clase.
private int preciobase; // el atributo se hace poniendo que es en este caso es un int. Por seguridad ponemos private para que no me hakeen.
private String color; 
private char consumo; //el char es un tipo de dato que solo puede tener un valor.
private double peso; //ponemos double porque simpre lleva decimales el peso.


//Creamos un constructor por defecto	
	public T8ejercicio03 () { // es un contructor que es  algo que volvemos a poner/repeetir el nombre para que se acuerde el ordenador.
	//usamos el this para que se acuerde de lo que hemos puesto antes (sera una variable general/en todas las pestañitas se va a acordar)
		//y se quede el valor y no lo olvied como una variable local.
this.preciobase = 100; 
this.color = "blanco";
this.consumo = 'F'; // se pone solo un  '  porque es un char  y solo hay una letra/valor.
this.peso = 5;

	}
	
	//creamos un constructor para el precio y peso. 
	
 public T8ejercicio03 (double peso, int preciobase) { 
	 //simpre ha de haver un constructor por defecto y ahora dentro de () ponemos lo que el usuario quiere o nos pide.
	 
	this.peso = peso; // el segundo peso es el nombre que le daremos al parametro.
	//A indicar this en el primero dices que essta fura del general para el primer parametro.
	this.preciobase = preciobase; 
	
 
 }
//creamos un constructor todos los atributos
 public T8ejercicio03 (double peso, int preciobase, char consumo, String color) { 
	 
	 
	this.peso = peso; // el segundo peso es el nombre que le daremos al parametro.
	//A indicar this en el primero dices que essta fura del general para el primer parametro.
	this.preciobase = preciobase; 
	this.consumo = consumo;
	this.color = color; // tiene que ser el mismo nombre qu ele pones en el parametro es decir , el mismo numero que le pones dentro de los ()
	
 
 }
}
