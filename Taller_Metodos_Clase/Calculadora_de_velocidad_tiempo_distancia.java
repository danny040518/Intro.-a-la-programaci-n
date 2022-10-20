package Clase18OCT;

import javax.swing.JOptionPane;

public class Calculadora_de_velocidad_tiempo_distancia {

	public static void main(String[] args) {
		int v= 0,t=0,d=0,respuesta;
		respuesta=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la accion que deseas calcular\n1.Velocidad\n2.Tiempo\n3.Distancia"));
		switch(respuesta){
		case 1:
			velocidad(d,t);
			break;
		case 2:
			tiempo(d,v);
			break;
		case 3:
			distancia(v,t);
			break;		
		}
	}
	public static void velocidad (int d, int t) {
	   d =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia recorrida en metros:"));
	   t =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en el que recorrio la distancia anterior en segundos:"));
	   double velocidad = d/t;
		JOptionPane.showMessageDialog(null, "La velocidad en la que recorrio "+d+"m, en"+t+"sg, es de "+velocidad+"m/sg");
	}
	public static void tiempo (int d,int v) {
		d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la distancia recorrida en metros:"));
		v = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad en la que recorrio en tiempo anterior en m/sg:"));
		double tiempo = d/v;
		JOptionPane.showMessageDialog(null, "El tiempo en el que recorrio "+d+"m, a"+v+"m/sg, es de "+tiempo+"sg");
	}
	public static void distancia (int v, int t) {
		 v =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la velocidad a la que iba en m/sg:"));
		 t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo en el que iba a tal velocidad en sg"));
		 double distancia = v*t;
		 JOptionPane.showMessageDialog(null, "La distancia en la que iba a "+v+"m/sg, en"+t+"sg, es de "+distancia+"m");
	}

}
