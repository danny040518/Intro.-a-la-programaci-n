package Taller2;

import javax.swing.JOptionPane;

public class GradosaRadianes {

	public static void main(String[] args) {
		
			int grados = Integer.parseInt(JOptionPane.showInputDialog("que grados desea convertir " + "\n" + "1. Grados" + "\n" + "2. Radianes "));
			
			if (grados == 1) {
				
					int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para hacer la conversion"));
					int conversion = (int) (valor * (3.1416/180));
					System.out.println(valor + " grados es igual a" + conversion + " radianes");
				}
			    else {
					if (grados == 2) {
			    		int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para hacer la conversion"));
						int conversion = (int) (valor * (180/3.1416));
						System.out.println(valor + " radianes es igual a" + conversion + " grados");
			    	}
			    	else 
			    		System.out.println("Por favor solo escojer una de la 2 opciones");
			    }
		}
		    		
	}

