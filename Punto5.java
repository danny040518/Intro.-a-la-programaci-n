package Taller;

import javax.swing.JOptionPane;

public class Punto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Gasto de agua en una vivienda dado el número de litros gastados
		JOptionPane.showMessageDialog(null, "Calcula el gasto de agua de tu vivienda.");
		int litros, fija, total1, total2;
		fija = 60;
		litros = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los litros "));
		total1 = (litros - 50) * 30 + fija;
		total2 = (litros - 50) * 50 + fija;
		if (litros >= 0 && litros <= 50) {
			JOptionPane.showMessageDialog(null,
					" Como los primeros 50 litros son gratis solo se debe pagar la cuota fija mensual que son: " + fija
							+ " dolares.");
		} else if (litros > 50 && litros <= 200) {
			JOptionPane.showMessageDialog(null, "Se debe pagar un total de: " + total1 + " dolares.");
		} else if (litros > 200) {
			JOptionPane.showMessageDialog(null, "Se debe pagar un total de: " + total2 + " dolares.");
		}

	}

}
