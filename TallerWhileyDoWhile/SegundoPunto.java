package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class SegundoPunto {

	public static void main(String[] args) {
		
		int n1=2;
		int n2=100;
		int suma = 0;
		while (n1<=n2) {
			suma += n1; 
			n1++;
			n1++;
		}
		JOptionPane.showMessageDialog(null,("La suma de los numero pares entre 2 y 100 es: " +suma));
	}
}
