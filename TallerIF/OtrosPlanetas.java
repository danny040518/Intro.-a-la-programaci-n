package TallerIF;

import javax.swing.JOptionPane;

public class OtrosPlanetas {

	public static void main(String[] args) {
		
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite el peso que quiere calcular: "));
		double mercurio = (double) ((peso*3.7)/9.8); 
		double venus = (double) ((peso*8.87)/9.8);
		double marte = (double) ((peso*3.7)/9.8);
		double jupiter = (double) ((peso*24.79)/9.8);
		double saturno = (double) ((peso*10.44)/9.8);
		double urano = (double) ((peso*8.87)/9.8);
		double neptuno = (double) ((peso*11.15)/9.8);
		double pluton = (double) ((peso*0.62)/9.8);
		
		JOptionPane.showMessageDialog(null, "si el peso en la tierra es: "+peso+"\n El peso en \n Mercurio es: "+mercurio+
				"\n Venus es: "+venus+"\n Marte es: "+marte+"\n Jupiter es: "+jupiter+"\n Saturno es: "
				+saturno+"\n Urano es: "+urano+"\n Neptuno es: "+neptuno+"\n Pluton es: "+pluton);

	}

}
