package TallerIF;

import javax.swing.JOptionPane;

public class Obrero {

	public static void main(String[] args) {
		
		
		int horasdetrabajo = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas en la semana:"));
		
		if (horasdetrabajo <= 40) {
			double salariosemanal = (horasdetrabajo*16);
			System.out.println("Su salario semanal fue de: $" +salariosemanal);
		}
			else {
		    double horasextra = (horasdetrabajo-40);
		    double salariosemanal = ((horasextra*20)+(40*16));
		    System.out.println("Su salario semanal fue de: $" +salariosemanal);
		    
			
			
		}
	}

	}


