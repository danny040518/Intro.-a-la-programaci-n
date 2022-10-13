package Taller;

import javax.swing.JOptionPane;

public class Punto1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pedir un número y decir si es positivo, negativo ó 0.​
		JOptionPane.showMessageDialog(null, " Identificador de números.");
 double numero;
 numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite un número"));
 if (numero > 0) {
	 JOptionPane.showMessageDialog(null, "El número digitado " + numero + " es positivo.");
 }
 else if (numero < 0) {
	 JOptionPane.showMessageDialog(null, "El número digitado " + numero + " es negativo.");
	}
 else if (numero == 0) {
	 JOptionPane.showMessageDialog(null, "El número es 0");
	}
	}
}
