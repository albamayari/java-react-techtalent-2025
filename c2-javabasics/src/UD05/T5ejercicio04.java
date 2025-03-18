package UD05;
import javax.swing.JOptionPane; // Importamos JOptionPane para usar cuadros de diálogo

public class T5ejercicio04 {

    public static void main(String[] args) {
        // Paso 1: Pedir al usuario que ingrese el radio del círculo
        // Usamos JOptionPane.showInputDialog para mostrar un cuadro de diálogo
        String radioStr = JOptionPane.showInputDialog("Introduce el radio del círculo:");

        // Paso 2: Convertir el valor ingresado (String) a double
        // Usamos Double.parseDouble para convertir el String a un número de tipo double
        double radio = Double.parseDouble(radioStr);

        // Paso 3: Calcular el área del círculo
        // Usamos la constante Math.PI para obtener el valor de π (pi)
        // Usamos Math.pow para elevar el radio al cuadrado (R^2)
        double area = Math.PI * Math.pow(radio, 2);

        // Paso 4: Mostrar el resultado al usuario
        // Usamos JOptionPane.showMessageDialog para mostrar el área calculada
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);
    }
}