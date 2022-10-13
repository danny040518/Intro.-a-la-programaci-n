package Quiz1;

import javax.swing.JOptionPane;

public class SegundoPunto {

	public static void main(String[] args) {
		
        String temperatura = JOptionPane.showInputDialog("Que temperatura desea convertir C/F ");
		
		if (temperatura.equals("C") || temperatura.equals("c")) {
			
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la temperatura"));
				int CaF = (int) (5 * (valor-32)/9);
				JOptionPane.showMessageDialog(null,valor + " grados Celsius es igual a" + CaF + " grados Fahrenheir");
			}
		    else if (temperatura.equals("F") || temperatura.equals("f")) {
		    	int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la temperatura"));
				int FaC = (int) (9 * (valor/5)+32);
				JOptionPane.showMessageDialog(null,valor + " grados Fahrenheit es igual a" + FaC + " grados Celsius");
		    	}

	}

}
