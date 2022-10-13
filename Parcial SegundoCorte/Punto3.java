package SegundoCorte;
import javax.swing.JOptionPane;
public class Punto3 {
	public static void main(String[] args) {
		int numingre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		 for(int numinicio=0;numinicio<=numingre;numinicio++) {
			 if(numinicio%2!=0) {
				 JOptionPane.showMessageDialog(null,((numinicio+" \n")));
			 }
	}
}}
