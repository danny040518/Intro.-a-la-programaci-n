package Quiz1;

import javax.swing.JOptionPane;

public class PrimerPunto {

	public static void main(String[] args) {
		
		String respuesta = JOptionPane.showInputDialog("Hizo la tarea S/N?:");

		if (respuesta.equals("S") || respuesta.equals("SI") || respuesta.equals("si") || respuesta.equals("Si")) {
			boolean aceptar = true;
			JOptionPane.showMessageDialog(null,"Tienes un 5 en tu nota");
			
		}
		else if (respuesta.equals("N") || respuesta.equals("NO") || respuesta.equals("no") || respuesta.equals("No")){
			boolean aceptar = false;
			JOptionPane.showMessageDialog(null,"Tienes un 0 en tu nota");
		}
		else {
			JOptionPane.showMessageDialog(null, "error:(");
		}
		

	}

}
