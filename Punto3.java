package Taller;

import javax.swing.JOptionPane;

public class Punto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Dados dos números enteros decir cual es el mayor, cuál es el menor o si son iguales.
		JOptionPane.showMessageDialog(null, " Comparador de números.");
		int n1, n2;
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primero número entero. "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo número entero.  "));
		if (n1 < n2) {
			JOptionPane.showMessageDialog(null, n2 + " es el mayor y " + n1 + " es el menor.");

		} else if (n1 > n2) {
			JOptionPane.showMessageDialog(null, n1 + " es el mayor y " + n2 + " es el menor.");
		} else if (n1 == n2) {
			JOptionPane.showMessageDialog(null, "¡Son el mismo número!");
		}
	}

}
