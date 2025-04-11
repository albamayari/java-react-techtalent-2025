package UD08;

public class T8ejercicio04 {

private String titulo;
private char ntemporadas;
private boolean entregado; //boolean porque es si o no
private char genero;
private String creador; 

public T8ejercicio04() { //lo dejamos vacio porque es es contructor por defecto.
 this.ntemporadas = 3;
 this.entregado = false;
 
}

 public T8ejercicio04(String titulo, String creador) {
	this.titulo= titulo; //se pone otra vez para que se guarde.
	this.creador = creador;
 }
 
public T8ejercicio04(String titulo, String creador, char ntemporadas, char genero ) {
this.titulo= titulo;
this.ntemporadas = ntemporadas;
this.genero=genero;
this.creador = creador;

}
}
