package Taller;

import javax.swing.JOptionPane;

public class Punto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Compara años
		JOptionPane.showMessageDialog(null, " Comparador de años.");
		int year1, year2, total1, total2;
		year1 = Integer.parseInt(JOptionPane.showInputDialog(null, "¿En que año estamos? "));
		year2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un año cualquiera "));
		total1 = year1 - year2;
		total2 = year2 - year1;
		if (year1 > year2) {
			JOptionPane.showMessageDialog(null, " Desde el año " + year2 + " han pasado " + total1 + " años.");
		} else if (year2 > year1) {
			JOptionPane.showMessageDialog(null, " Para llegar al año" + year2 + " faltan " + total2 + " años.");

		} else if (year1 == year2) {
			JOptionPane.showMessageDialog(null, "¡Son el mismo año!");
		}

	}

}
