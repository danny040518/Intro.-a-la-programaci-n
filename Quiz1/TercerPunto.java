package Quiz1;

import javax.swing.JOptionPane;

public class TercerPunto {

	public static void main(String[] args) {
		
		String nota = JOptionPane.showInputDialog("En la escala de notas \n E \n S \n A \n I \n D \n ¿Que nota obtuviste?");

		switch (nota) {
		case "E" :
			JOptionPane.showMessageDialog(null, ("El equivalente numerico de su nota es 4.0"));
			break;
			
		case "S" :
			JOptionPane.showMessageDialog(null, ("El equivalente numerico de su nota es 3.0"));
			break;
			
		case "A" :
			JOptionPane.showMessageDialog(null, ("El equivalente numerico de su nota es 2.0"));
			break;
			
		case "I" :
			JOptionPane.showMessageDialog(null, ("El equivalente numerico de su nota es 1.0"));
			break;
			
		case "D" :
			JOptionPane.showMessageDialog(null, ("El equivalente numerico de su nota es 0.0"));
			break;
			
		default:	JOptionPane.showMessageDialog(null,("ERROR / TU NOTA ES 0.0"));
			
			
	}

	}

}
