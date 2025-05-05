package UD09;

public class T9ejercicio01 {
	// esto son atributos(carasteristicas) porque estan dentro de una clase que es un objeto (el nombre del ejerciocio en este caso)
protected int preciobase;
protected String color;
protected char consumoenergetico;
protected double peso;


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
//Metodos get de los atibutos- colores--comprobarColor(String color)
public void comprobarColor (String Comprobar) {  
//es un  void porque no devuelve nada y despues recuerda poner si es un char para saber como medirlo
//ponemos un syso ya que el ejercicio nos pide que mostremos los valores/ colores
	// el ejercicio nos pide que -invocara al crear el objeto y no sera visible- eso significa que sera un public void.

	
if (getColor().equalsIgnoreCase("blanco")) { //equalsIgnoreCase serveix per ignorar si s escribe en mayuscula o minuscula
	System.out.println("Este blanco");
}
else if (getColor().equalsIgnoreCase("negro")) { //else if  par que si la condicion no es esa es la otra.
	System.out.println("Este negro");
}
else if (getColor().equalsIgnoreCase("rojo")) {
	System.out.println("Este rojo");
}
else if (getColor().equalsIgnoreCase("azul")) { 
	System.out.println("Este azul");
}
else if (getColor().equalsIgnoreCase("gris")) { 
	System.out.println("Este gris");
}	
}
//Metodos get de los atibutos- comprobarConsumoEnergetico(char letra)- consumo energetico
public void comprobarConsumoEnergetico(char Comprobar) {
	if (getConsumoenergetico() == 'A') {  //se pone () despues del metodo para saber que es un metodo. 
		//No se pone nada en este caso ya que no hay ningun parametro en este caso.
		System.out.println("Este es el consumoenergetico A" );
	}
	else if (getConsumoenergetico() == 'F') {
		System.out.println("Este es el consumoenergetico F" );
	}
	else if (getConsumoenergetico() == 'E') {
		System.out.println("Este es el consumoenergetico E" );
	}
	else if (getConsumoenergetico() == 'D') {
		System.out.println("Este es el consumoenergetico D" );
	}
	else if (getConsumoenergetico() == 'C') {
		System.out.println("Este es el consumoenergetico C" );
	}
	else if (getConsumoenergetico() == 'B') {
		System.out.println("Este es el consumoenergetico B" );
		
	}
	}
	
//Metodos get de los atibutos- PrecioFinal- según el consumo energético, aumentara su precio, y	según su tamaño, también.

public int precioFinal(int precio) {
	//aqui no utilizamos un void porque estamos gurdando una informacion- en este caso int precio.
	
	
	if (getConsumoenergetico()== 'F') {
		this.preciobase += 10;
	}
	else if (getConsumoenergetico()== 'E') {
		this.preciobase += 30;
	}
	else if (getConsumoenergetico()== 'D') {
		this.preciobase += 50;
	}
	else if (getConsumoenergetico()== 'C') {
		this.preciobase += 60;
	}

	else if (getConsumoenergetico()== 'B') {
		this.preciobase += 80;
	}
	else if (getConsumoenergetico()== 'A') {
		this.preciobase += 100;
	}

	if (getPeso() <= 19) {
	    this.preciobase += 10;
	} else if (getPeso() >= 20 && getPeso() <= 49) {
	    this.preciobase += 50;
	} else if (getPeso() >= 50 && getPeso() <= 79) {
	    this.preciobase += 80;
	} else if (getPeso() >= 80) {
	    this.preciobase += 100;
	}
	precio = this.preciobase; // tenemos que decirle  que el precio es. simepre la variable va primero y se iguala al atributo--
									//- lo hacemos de esta manera porque  precio esta vacio y lo tenemos que igualar a algo que tiene valor.
	return precio; //se ha de devolver siempre porque es un metodo que no es void
	
	

}
}


