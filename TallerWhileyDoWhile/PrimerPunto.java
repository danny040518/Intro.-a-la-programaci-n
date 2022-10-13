package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class PrimerPunto {

	public static void main(String[] args) {
		
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a los cuales les desea calcular el promedio"));
		double n=0;
		double acumulador = 1;
		while (acumulador<=cantidad) {
			double x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " +acumulador+ " numero"));
			n += x;
			acumulador ++;	
		}
		 double prome = (n / cantidad);
		 JOptionPane.showMessageDialog(null,("El promedio de los valores ingresados es: " +prome));
	}
}
