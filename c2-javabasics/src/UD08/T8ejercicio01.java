package UD08;

public class T8ejercicio01 {

	    // Constante para el sexo por defecto
	    private static final char SEXO_POR_DEFECTO = 'H'; // H = Hombre

	    // Atributos privados (encapsulados)
	    private String nombre;
	    private int edad;
	    private String dni;
	    private char sexo;
	    private double peso;
	    private double altura;

	    // Constructor por defecto
	    public T8ejercicio01() {
	        this.nombre = "";
	        this.edad = 0;
	        this.dni = "";
	        this.sexo = SEXO_POR_DEFECTO;
	        this.peso = 0.0;
	        this.altura = 0.0;
	    }

	    // Constructor con nombre, edad y sexo (el resto por defecto)
	    public T8ejercicio01(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = "";
	        this.peso = 0.0;
	        this.altura = 0.0;
	    }

	    // Constructor con todos los atributos
	    public T8ejercicio01(String nombre, int edad, String dni, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.dni = dni;
	        this.sexo = sexo;
	        this.peso = peso;
	        this.altura = altura;
	    }

	    // Getters y setters
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public char getSexo() {
	        return sexo;
	    }

	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public double getAltura() {
	        return altura;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }
	    public static void main(String[] args) {
	    	
	    }
	} 
