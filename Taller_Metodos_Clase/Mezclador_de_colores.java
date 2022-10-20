package Clase18OCT;

import javax.swing.JOptionPane;

public class Mezclador_de_colores {

	public static void main(String[] args) {

				JOptionPane.showMessageDialog(null, "Mezcla de Colores primarios.");
				int color1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Primer Color primario: "
						+ "\n 1. Para amarillo"
						+ "\n 2. Para azul "
						+ "\n  3. Para rojo"));
				int color2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Segundo Color primario"
						+ "\n 1. Para amarillo"
						+ "\n 2. Para azul"
						+ "\n  3. Para rojo"));
				int suma=suma1(color1,color2);
			}
			public static int suma1 (int color1, int color2) {

				int suma=color1+color2;
				if(color1==1&&color2==2|| color1==2&&color2==1) {
					JOptionPane.showMessageDialog(null, "La mezcla de los colores da VERDE 😊");
				}
				else if(color1==1&&color2==3|| color1==3&&color2==1) {
					JOptionPane.showMessageDialog(null, "La mezcla de los colores da NARANJA 😊");
				}
				else if(color1==2&&color2==3|| color1==3&&color2==2) {
					JOptionPane.showMessageDialog(null, "La mezcla de los colores da MORADO 😊");
				}
				else if(color1==2&&color2==2|| color1==3&&color2==3|| color1==1&&color2==1){
					JOptionPane.showMessageDialog(null, "No puedes combinar el mismo color.");
				}
				else {
					JOptionPane.showMessageDialog(null, "No es válido lo que digitaste.");
				}
				return suma;
				
			}
		}

