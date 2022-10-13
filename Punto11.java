package Taller;

import javax.swing.JOptionPane;

public class PuntoP11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprimir su recibo de pago para el próximo semestre
		JOptionPane.showMessageDialog(null,"¿Desea imprimir su recibo de pago para el próximo semestre?");
		JOptionPane.showMessageDialog(null,"Siga las siguientes indicaciones.");
		JOptionPane.showMessageDialog(null,"Recuerde que para ser aceptado tiene que cumplir con ciertas especificaciones.");
		int semestre, carrera;
		semestre=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el número del semestre anterior \n"
				+ " 1= Primer semestre\n"
				+ " 2= Segundo semestre\n"
				+ " 3= Tercer semestre\n"
				+ " 4= Cuarto semestre\n"
				+ " 5= Quinto semestre\n"
				+ " 6= Sexto semestre\n"
				+ " 7= Septimo semestre\n"
				+ " 8= Octavo semestre\n"
				+ " 9= Noveno semestre\n"));
		if(semestre>9 || semestre<1) {
			JOptionPane.showMessageDialog(null,"Ingrese un semestre válido");
			semestre=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el número del semestre anterior \n"
					+ " 1= Primer semestre\n"
					+ " 2= Segundo semestre\n"
					+ " 3= Tercer semestre\n"
					+ " 4= Cuarto semestre\n"
					+ " 5= Quinto semestre\n"
					+ " 6= Sexto semestre\n"
					+ " 7= Septimo semestre\n"
					+ " 8= Octavo semestre\n"
					+ " 9= Noveno semestre\n"));
			
		}
		
		carrera=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el número de la carrera en la que se encuentra \n"
				+ "1. Actuación\n"
				+ "2. Arquitectura\n"
				+ "3. Veterinaria\n "
				+ "4. Diseño\n"));
		if(carrera>=5|| carrera<1) {
			JOptionPane.showMessageDialog(null,"Escoja solo una de las 4 opciones");
			carrera=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar el número de la carrera en la que se encuentra \n"
					+ "1. Actuación\n"
					+ "2. Arquitectura\n"
					+ "3. Veterinaria\n "
					+ "4. Diseño\n"));
			
		}
		
		
		double promedio;
		promedio=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite cual fue su promedio en el semestre anterior"));
		
		 if (promedio>5|| carrera<1) {
			JOptionPane.showMessageDialog(null,"Ingrese un promedio válido");
			promedio=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite cual fue su promedio en el semestre anterior"));
		}
		 if(carrera==1&&semestre>6&&promedio>=3.9){
			JOptionPane.showMessageDialog(null,"Señor usuario usted es aceptado para imprimir la orden de pago para el próximo semestre");
		}
		else if(carrera==2&&semestre>=6&&promedio>4.0){
			JOptionPane.showMessageDialog(null,"Señor usuario usted es aceptado para imprimir la orden de pago para el próximo semestre");
		}
		else if(carrera==3&&semestre>5&&promedio>=3.7){
			JOptionPane.showMessageDialog(null,"Señor usuario usted es aceptado para imprimir la orden de pago para el próximo semestre");
		}
		else if(carrera==4&&semestre>=3&&promedio>=3.5){
			JOptionPane.showMessageDialog(null,"Señor usuario usted es aceptado para imprimir la orden de pago para el próximo semestre");
		}
		else{
			JOptionPane.showMessageDialog(null,"Señor usuario usted no es aceptado para imprimir la orden de pago para el próximo semestre");
		}
		
		
		
	}

}
