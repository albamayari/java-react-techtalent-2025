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

//cramos un constructor con todos los atributos.
public T9ejercicio01(int preciobase,String color, char consumoenergetico, double peso) {
	this.preciobase = preciobase;
	this.color = color;
	this.consumoenergetico = consumoenergetico;
	this.peso = peso;	
}
	
//Metodos get de los atibutos- refiriendose a todos en general
//el get se hace clickando a Source-- Generate Getters and Setters-- y selecionas todos ellos en este caso
//Los getters y setters sirven para ver y cambiar los datos de un objeto que están protegidos.
	//Los getters sirven para consultar un valor.
	//Los setters sirven para modificar un valor.

public int getPreciobase() {
	return preciobase;
}
public void setPreciobase(int preciobase) {
	this.preciobase = preciobase;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public char getConsumoenergetico() {
	return consumoenergetico;
}
public void setConsumoenergetico(char consumoenergetico) {
	this.consumoenergetico = consumoenergetico;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
//Metodos get de los atibutos- comprobarConsumoEnergetico
public void comprobarColor (String Comprobar) {  
//se one void porque no devuelve nada y despues recuerda poner si es un char para saber como medirlo

if (getColor().equalsIgnoreCase("blanco")) { //equalsIgnoreCase serveix per ignorar si s escribe en mayuscula o minuscula
	
}
else if (getColor().equalsIgnoreCase("negro")) { //else if  par que si la condicion no es esa es la otra.
	
}
if (getColor().equalsIgnoreCase("rojo")) {
	
}
if (getColor().equalsIgnoreCase("azul")) { 
	
}
if (getColor().equalsIgnoreCase("gris")) { 
	
}	
}
//Metodos get de los atibutos- 
public void comprobarConsumoEnergetico(char Comprobar) {
if (getConsumo().equalsIgnoreCase("A")) {
	
}
}
}

}
 

//"blanco","negro","rojo","azul","gris";