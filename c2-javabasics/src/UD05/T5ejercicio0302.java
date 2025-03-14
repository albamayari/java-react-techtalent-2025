package UD05;

import javax.swing.JOptionPane;

public class T5ejercicio0302 {

	public static void main(String[] args) {
		// Declarar la variable nombreUsuario
		String nombreUsuario;
		// Mensaje de bienvenida con nombre predefinido
		nombreUsuario = JOptionPane.showInputDialog("Por favor, introduce tu nombre:");

		// Verificar si el usuario ingresó un nombre
		if (nombreUsuario != null && !nombreUsuario.isEmpty()) {
			// Mostrar mensaje de bienvenida con el nombre ingresado
			JOptionPane.showMessageDialog(null, "Bienvenido " + nombreUsuario);
		} else {
			// Mostrar mensaje si no se ingresó un nombre
			JOptionPane.showMessageDialog(null, "No ingresaste un nombre.");
		}
	}
}
