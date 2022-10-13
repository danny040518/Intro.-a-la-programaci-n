package TallerWhileyDoWhile;

import javax.swing.JOptionPane;

public class OctavoPunto {

	public static void main(String[] args) {
		int centavos = 50;
		float ingresoMensual = (96*400);
		float Am=-1*centavos;
		int años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de años para realizar la proyección"));
		int meses = años*12;
		String aumento = JOptionPane.showInputDialog("Teniendo cuenta que existe un aumento\nmensual de 50 centavos,¿Desea cambiarlo SI/NO?");
		
		if(aumento.equals("SI")) {
		  int cambio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el aumento en centavos: "));
		  centavos = cambio;
		}
		int i = 1;
		int va = 0;
		int bv=0;
		float vm=0;
		while(i<=meses) {
			Am=(Am+centavos);
			vm = (9600+Am)*400;
			bv = bv + 400;
			if(i==12) {
				va = (int) vm;
			}
			i++;
		}
		JOptionPane.showMessageDialog(null,"El ingreso mensual es de:"+ingresoMensual+"El ingreso anual es de:"+va/100+"El ingreso total es de:"+vm/100+"y el total de barriles vendidos:"+bv);
		}
	}


