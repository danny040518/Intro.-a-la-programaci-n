package Taller2;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double peso = Double.parseDouble(JOptionPane.showInputDialog("digite peso en kg"));
		double estatura = Double.parseDouble(JOptionPane.showInputDialog("digite altura en metros"));
		double imc = peso/(estatura * estatura);
		System.out.print("la masa corporal es: "+ imc);
		
	}

}
