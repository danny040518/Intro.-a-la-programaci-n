package TallerCiclos;

import javax.swing.JOptionPane;

public class CuartoPunto {

	public static void main(String[] args) {
		int poblacion;
		String input= JOptionPane.showInputDialog("Ingrese la población de la ciudad");
		poblacion= Integer.parseInt(input);
		while(poblacion<=0) {
			JOptionPane.showMessageDialog(null,"Ingrese un número positivo mayor a 0 ");
			input= JOptionPane.showInputDialog("Ingrese la población de la ciudad");
			poblacion= Integer.parseInt(input);
		}
		if(poblacion>0) {
			JOptionPane.showMessageDialog(null,"La población actual es: "+ input);
		}

	}
	}

