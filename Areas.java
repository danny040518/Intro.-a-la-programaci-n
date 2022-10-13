package Taller2;

import javax.swing.JOptionPane;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo:"));
		   double areac = (radio*radio)*Math.PI;
		   JOptionPane.showMessageDialog(null,"El area del circulo es: "+areac);
		
		double baset = Double.parseDouble(JOptionPane.showInputDialog("Digite base del triangulo:"));
		   double alturat = Double.parseDouble(JOptionPane.showInputDialog("Digite altura del triangulo:"));
		   double areat = (baset*alturat)/2;
		   JOptionPane.showMessageDialog(null,"El area del triangulo es: "+areat);
		
		double ladoc = Double.parseDouble(JOptionPane.showInputDialog("Digite un lado del cuadrado:"));
		   double areac1 = ladoc*ladoc;
		   JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+areac1);

	}

}
