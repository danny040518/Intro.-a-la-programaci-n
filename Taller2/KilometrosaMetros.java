package Taller2;

import javax.swing.JOptionPane;

public class KilometrosaMetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				double kh = Double.parseDouble(JOptionPane.showInputDialog("Digite km/h: "));
				double ms = kh/3.6;
				System.out.print(kh+" kilometros/hora son: "+ms+" metros por segundo.");
			}

	}

