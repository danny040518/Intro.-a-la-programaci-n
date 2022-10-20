package Clase18OCT;

import javax.swing.JOptionPane;

public class Conversor_de_moneda {

	public static void main(String[] args) {
		double conversor = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad que desea convertir de pesos Colombianos"));

		double converti= conversor1(conversor);
		JOptionPane.showMessageDialog( null, "La conversion de la cantidad ingresada de pesos colombianos " + conversor+ " en dolares son:  "+ converti+ " dolares Estado Unidenses.");

		double convert= conversor2(conversor);
		JOptionPane.showMessageDialog( null, "La conversion de la cantidad ingresada de pesos colombianos " + conversor+ " en euros son:  "+ convert+ " euros.");

		double conver= conversor3(conversor);
		JOptionPane.showMessageDialog( null, "La conversion de la cantidad ingresada de pesos colombianos " + conversor+ " en libras son:  "+ conver+ " libras esterlinas.");

		double conve= conversor1(conversor);
		JOptionPane.showMessageDialog( null, "La conversion de la cantidad ingresada de pesos colombianos " + conversor+ " en peso mexicano son:  "+ conve+ " pesos mexicanos.");
	}
	public static double conversor1(double conversor) {
		double converti=conversor*0.00021;

		return converti;	
	}
	public static double conversor2(double conversor) {
		double convert=conversor*0.00022;

		return convert;	
	}
	public static double conversor3(double conversor) {
		double conver=conversor*0.00019;

		return conver;	
	}
	public static double conversor4(double conversor) {
		double conve=conversor*0.0042;
		return conve;	
	}

}

