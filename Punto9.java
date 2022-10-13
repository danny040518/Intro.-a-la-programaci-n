package Taller;

import javax.swing.JOptionPane;

public class Punto9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Piedra,papel o tijeras 
		JOptionPane.showMessageDialog(null, "Piedra, Papel o Tijeras");
		JOptionPane.showMessageDialog(null, "¡VAMOS A JUGAR!");
		int juegocom, persona;
		juegocom = (int) (Math.random() * 3) + 1;
		JOptionPane.showMessageDialog(null, "La computadora ya eligio.");
		persona = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Escoge un Número: \n" + "1= Piedra\n" + "2= Papel\n" + "3= Tijeras\n"));
		if(persona>3|| persona<1) {
			JOptionPane.showMessageDialog(null, "Elige una opción que este entre los parámetros establecidos 😀");
			persona = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Escoge un Número: \n" + "1= Piedra\n" + "2= Papel\n" + "3= Tijeras\n"));
		}

		if (persona == 1 && juegocom == 2) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Piedra y la de la computadora fue: " + juegocom + "= Papel");
			JOptionPane.showMessageDialog(null, "Perdiste 😞");
		} else if (persona == 1 && juegocom == 3) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Piedra y la de la computadora fue: " + juegocom + "= Tijeras");
			JOptionPane.showMessageDialog(null, "¡Ganaste! 🎉");
		} else if (persona == 2 && juegocom == 3) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Papel y la de la computadora fue: " + juegocom + "= Tijeras");
			JOptionPane.showMessageDialog(null, "Perdiste 😞");
		} else if (persona == 2 && juegocom == 1) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Papel y la de la computadora fue: " + juegocom + "= Piedra");
			JOptionPane.showMessageDialog(null, "¡Ganaste! 🎉");
		} else if (persona == 3 && juegocom == 1) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Tijeras y la de la computadora fue: " + juegocom + "= Piedra");
			JOptionPane.showMessageDialog(null, "Perdiste 😞");
		} else if (persona == 3 && juegocom == 2) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Tijeras y la de la computadora fue: " + juegocom + "= Papel");
			JOptionPane.showMessageDialog(null, "¡Ganaste! 🎉");
		} else if (persona == 2 && juegocom == 2) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Papel y la de la computadora fue: " + juegocom + "= Papel");
			JOptionPane.showMessageDialog(null, "Hay un empate, vuelve a jugar");
		} else if (persona == 1 && juegocom == 1) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Piedra y la de la computadora fue: " + juegocom + "= Piedra");
			JOptionPane.showMessageDialog(null, "Hay un empate, vuelve a jugar");
		} else if (persona == 3 && juegocom == 3) {
			JOptionPane.showMessageDialog(null,
					"Tu respuesta fue: " + persona + "= Tijeras y la de la computadora fue: " + juegocom + "= Tijeras");
			JOptionPane.showMessageDialog(null, "Hay un empate, vuelve a jugar");
		}

	}
}
