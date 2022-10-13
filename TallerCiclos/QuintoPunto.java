package TallerCiclos;

import javax.swing.JOptionPane;

public class QuintoPunto {

	public static void main(String[] args) {
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int turno = 0;
		for(int i = 0; i<5; i++) {
		turno++;
		JOptionPane.showMessageDialog(null, "TURNO NUMERO "+turno+"\n");
		int bolosJ1=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos bolos tumbo el jugador 1 en el turno "+turno));
		int bolosJ2=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos bolos tumbo el jugador 2 en el turno "+turno));
		int bolosJ3=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos bolos tumbo el jugador 3 en el turno "+turno));
		if (bolosJ1 >10 || bolosJ2 >10 ||bolosJ2 >10) {
		JOptionPane.showMessageDialog(null, "Ingrese un numero valido, solo se pueden tumbar 10 bolos maximo");
		}
		else {
		p1 = p1 + bolosJ1;
		p2 = p2 + bolosJ2;
		p3 = p3 + bolosJ3;
		}
		}
		JOptionPane.showMessageDialog(null,"puntos del jugador 1: "+p1+"\npuntos del jugador 2: "+p2+"\npuntos del jugador 3: "+p3);
		}

	}

