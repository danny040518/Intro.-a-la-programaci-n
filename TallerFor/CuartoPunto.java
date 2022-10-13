package TallerFor;

import javax.swing.JOptionPane;

public class CuartoPunto {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero mayor al anterior: "));
		int suma = 0;
		if(n1>n2) {
			JOptionPane.showMessageDialog(null,"el primer numero debe ser menor que el segundo.");
		}
		else if (n2==n1) {
			JOptionPane.showMessageDialog(null,"no pueden ser numeros iguales");
		}
		else {
			for(int i=n1;i<n2;i++) {
				suma=suma+i;
			}
			JOptionPane.showMessageDialog(null,"la suma de todos los numeros desde el "+n1+" hasta el "+n2+" es: "+suma);
		}
	}


	}


