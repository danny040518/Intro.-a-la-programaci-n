package Taller2;

import javax.swing.JOptionPane;

public class IVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String producto= JOptionPane.showInputDialog("Ingrese el nombre del producto");
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Valor de "+ producto));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de " + producto));
		
   double subtotal = valor * cantidad;
		   double subtotal2 = subtotal * 0.21;
		   double total = subtotal + subtotal2;
		   
	JOptionPane.showMessageDialog(null, "El producto comprado fue " + "" + producto + ", en total se compro una cantidad de " + cantidad + "" + producto + "a un precio de " + valor + "$. En total incluyendo el IVA todo salio por un total de " + total );	   
	}

}
