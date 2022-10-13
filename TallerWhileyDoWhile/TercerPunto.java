package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class TercerPunto {

	public static void main(String[] args) {
		
		int n1=15;
		int n2=24;
		while (n1<=n2) {
			n1++;
			n1++;
			n1++;
			JOptionPane.showMessageDialog(null,("Entre los multiplos de 3 que estan dentro de 15 y 30 se encuentran: " +n1));
		}
	}
}
