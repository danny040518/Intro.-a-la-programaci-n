package TallerCiclos;

import javax.swing.JOptionPane;

public class TercerPunto {

	public static void main(String[] args) {
		
			String input;
		int numero;
		input = JOptionPane.showInputDialog("Ingrese un número entero mayor a cero");
		numero = Integer.parseInt(input);
		while (numero > 0){
			System.out.println("Usted ingresó " + numero);
			input = JOptionPane.showInputDialog("Ingrese un número entero mayor a cero");
			numero = Integer.parseInt(input);
		}
		}
}
