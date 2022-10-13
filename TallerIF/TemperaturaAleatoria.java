package TallerIF;

import javax.swing.JOptionPane;

public class TemperaturaAleatoria {


	public static void main(String[] args) {
		
		int temperatura = (int)(Math.random()*60);
		
		if (temperatura<10) {
			JOptionPane.showMessageDialog(null, "Para una temperatura de: " +temperatura+ " está haciendo frio." );		
		}
		else if (temperatura >=10 && temperatura <=20 ) {
			JOptionPane.showMessageDialog(null, "Para una temperatura de: " +temperatura+ " el clima es nubado." );
		}
		else if (temperatura >=21 && temperatura <=30 ) {
			JOptionPane.showMessageDialog(null, "Para una temperatura de: " +temperatura+ " está haciendo calor." );
		}
		else if (temperatura >30 ) {
			JOptionPane.showMessageDialog(null, "Para una temperatura de: " +temperatura+ " el clima es tropical." );
		}
		else {
			
		}

	}

}
