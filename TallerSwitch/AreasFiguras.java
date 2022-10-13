package TallerSwitch;

import javax.swing.JOptionPane;

public class AreasFiguras {

	public static void main(String[] args) {
		int figura = Integer.parseInt(JOptionPane.showInputDialog("Seleccione la figura a la cual dese hallarle el area: \n 1.Circulo \n 2.Rectangulo \n 3.Cuadrado \n 4.Rombo \n 5.Triangulo"));

		switch (figura) {
		case 1 :
			int radiocirculo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del radio del circulo en centimetros"));
			int areacirculo = (int) (Math.PI * (radiocirculo^2));
			JOptionPane.showMessageDialog(null, ("El area del circulo es: " +areacirculo+ "cm"));
			break;
			
		case 2 :
			int baserectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base del rectangulo en centimetros"));
			int alturarectangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura del rectangulo en centimetros"));
			int arearectangulo = (int) (baserectangulo * alturarectangulo);
			JOptionPane.showMessageDialog(null,("El area del rectangulo es: " +arearectangulo+ "cm"));
			break;
			
		case 3 :
			int ladocuadrado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del lado del cuadrado en centimetros"));
			int areacuadrado = (int) (ladocuadrado^2);
			JOptionPane.showMessageDialog(null,("El area del cuadrado es: " +areacuadrado+ "cm"));
			break;
			
		case 4 :
			int diagonal1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la primera diagonal del rombo en centimetros"));
			int diagonal2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la segunda diagonal del rombo en centimetros"));
			int arearombo = (int) ((diagonal1*diagonal2)/2);
			JOptionPane.showMessageDialog(null,("El area del rombo es: " +arearombo+ "cm"));
			break;
			
		case 5 :
			int basetriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base del triangulo en centimetros"));
			int alturatriangulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura del triangulo en centimetros"));
			int areatriangulo = (int) ((basetriangulo * alturatriangulo)/2);
			JOptionPane.showMessageDialog(null,("El area del rectangulo es: " +areatriangulo+ "cm"));
			break;
			
		default:	JOptionPane.showMessageDialog(null,("Por favor ingrese uno de los valores de la lista"));
			
			
	}
	}
}


