package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class NovenoPunto {

	public static void main(String[] args) {
		 int tempinicial = 20;
		 double seg = 0;
		 int tempfinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la temperatura en la cual desea calcular \n el tiempo en minutos para la barra metalica, recuerde \n que la temperatura debe ser mayor a 20°C "));
		 
		do {
			 seg++;
			 tempinicial ++;
			 tempinicial ++;
		}
		 while ( tempinicial <= tempfinal );
		int min = (int) (seg / 60);
		JOptionPane.showMessageDialog(null, "La barra metalica tarda "+min+"min en llegar a "+tempfinal+"°C");
		
		 }
	}
