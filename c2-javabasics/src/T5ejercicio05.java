import javax.swing.JOptionPane; // Importamos JOptionPane para usar cuadros de diálogo

public class T5ejercicio05 {

    public static void main(String[] args) {
        // Parte 1: Calcular el área de un círculo
        // Paso 1: Pedir al usuario que ingrese el radio del círculo
        String radioStr = JOptionPane.showInputDialog("Introduce el radio del círculo:");

        // Paso 2: Convertir el valor ingresado (String) a double
        double radio = Double.parseDouble(radioStr);

        // Paso 3: Calcular el área del círculo
        double area = Math.PI * Math.pow(radio, 2);

        // Paso 4: Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + area);

        // Parte 2: Verificar si un número es divisible entre 2
        // Paso 1: Pedir al usuario que ingrese un número
        String numeroStr = JOptionPane.showInputDialog("Introduce un número para verificar si es divisible entre 2:");

        // Paso 2: Convertir el valor ingresado (String) a int
        int numero = Integer.parseInt(numeroStr);

        // Paso 3: Verificar si el número es divisible entre 2
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es divisible entre 2.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " no es divisible entre 2.");
        }
    }
}