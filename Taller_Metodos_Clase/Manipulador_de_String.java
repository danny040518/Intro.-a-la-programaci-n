package Clase18OCT;

import javax.swing.JOptionPane;

public class Manipulador_de_String {

	public static void main(String[] args) {

				String frasecadena =JOptionPane.showInputDialog(null, "Coloca una frase y conoce el numero de letras que tiene en mayusculas y minusculas."); 
				cadena(frasecadena);
				Cadenasinespacios(frasecadena);
				minusculas(frasecadena);
				mayusculas(frasecadena);

			}
			public static void cadena (String frasecadena) {
				int cadena = frasecadena.length();

				System.out.println("La Cantidad de letras que tiene esta palabra es: " + cadena);

			}

			public static void Cadenasinespacios (String frasecadena) {

				int Cadenasinespacios = frasecadena.replace(" ", "").length();
				System.out.println("La Cantidad de letras que tiene esta frase sin espacios es: " + Cadenasinespacios);


			}
			public static void minusculas (String frasecadena) {
				System.out.println( "La frase en minusculas es: "+ frasecadena.toLowerCase()); 
			}
			public static void mayusculas (String frasecadena) {
				System.out.println( "La frase en mayusculas es: "+ frasecadena.toUpperCase());
			}
		}
