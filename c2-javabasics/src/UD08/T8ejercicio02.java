package UD08;

public class T8ejercicio02 {
	
private int length; //es privado porque asi no te haquean.
private String password;

//creamos un constructor por defecto- un contructor es un metodo que se llama igual que la clase y no tiene tipo de retorno. 
//cremos un contructor para decir que un objeto , es decir el ejercio es algo y despuues lo podemis usar.
public T8ejercicio02 () { //creamos un constructor porque es un metodo que se llama igual que la clase y no tiene tipo de retorno. 
	//Los parentesis sirven para poner paramentros dentro del contructor/ cosa que se intancia/se hace cosas con ello.
this.length = 8; //posem this para que este fuera del congtructor y despues poder intanciarlo. 
// tenmos que volver a poner  el nombre del ejercicio para ponerle sus aatributos es decir, intanciarlo.
//No se podir aponer antes ya que era privado.

this.password = ""; // se ponen comillas para que el string este vacio para empezar a rellenarlo despues o que la gente lo haga.


}
}
