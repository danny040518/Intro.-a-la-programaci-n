package TallerIF;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		
		int numero = (int)(Math.random()*10+1);
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es par");
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero "+numero+" es impar");
		}
		

	}

}
