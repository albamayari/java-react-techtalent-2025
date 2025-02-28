package UD05;

public class T5ejercicio1 {

	public static void main(String[] args) {
		int variable1 = 3;
        int variable2 = 7;
        int variable3 = 13;
        int variable4 = 27;

        boolean esMayor = variable2 > variable1;
        boolean esMenor = variable3 < variable4;
        boolean esDistinto = variable3 != variable4;

        System.out.println("variable2 es mayor que variable1: " + esMayor);
        System.out.println("variable3 es menor que variable4: " + esMenor);
        System.out.println("variable3 es distinto que variable4: " + esDistinto);

	}

}
