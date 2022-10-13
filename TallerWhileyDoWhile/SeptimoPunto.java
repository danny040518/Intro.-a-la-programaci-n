package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class SeptimoPunto {

	public static void main(String[] args) {
		int i = 0;
		while (i<1) {
			String pedir = JOptionPane.showInputDialog("Ingrese su Contraseña: ");
			if (pedir.equals("papasarrozycarne")) {
				i++;
				JOptionPane.showMessageDialog(null,("CONTRASEÑA CORRECTA"));
			}
			else {
				JOptionPane.showMessageDialog(null,("CONTRASEÑA INCORRECTA"));
			}
		}
		JOptionPane.showMessageDialog(null,("BIEN HECHO"));
}
}

