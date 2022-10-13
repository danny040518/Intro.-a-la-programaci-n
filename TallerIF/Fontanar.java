package TallerIF;

import javax.swing.JOptionPane;

public class Fontanar {

	public static void main(String[] args) {
		
		double descuento= 0.3 ;
		double compra= Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de su compra:"));
		
		if (compra>300) {
			double precio= (compra * descuento);
			double precioT= (compra - precio);
			JOptionPane.showMessageDialog(null, "El precio de su compra es de: " +precioT);
		}
		else {
			JOptionPane.showMessageDialog(null, "El precio de su compra es de: " +compra);
			
		}	

	}

}
