package Clase18OCT;

import javax.swing.JOptionPane;

public class Calculadora_de_areas {

	public static void main(String[] args) {
		int base = 0,altura = 0,radio = 0,area=0;
		area=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la figura a la cual le desea calcular el area\n1.Triangulo\n2.Circulo\n3.Cuadrado\n4.Rectangulo"));
		switch(area){
		case 1:
			triangulo(base,altura);
			break;
		case 2:
			circulo(radio);
			break;
		case 3:
			cuadrado(base);
			break;	
		case 4:
			rectangulo(base,altura);
			break;	
		}
	}

	public static void triangulo (int base, int altura) {
	   base =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo:"));
	   altura =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo:"));
	   int triangulo = (base*altura)/2;
		JOptionPane.showMessageDialog(null, "El area del triangulo es:"+triangulo);
	}
	public static void circulo (int radio) {
		radio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el radio del circulo:"));
		int circulo = (int) (Math.PI*(radio^2));
		JOptionPane.showMessageDialog(null, "El area del circulo es:"+circulo);
	}
	public static void cuadrado (int base) {
		 base =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valorde un lado del cuadrado:"));
		 int cuadrado = (base*base);
		JOptionPane.showMessageDialog(null, "El area del cuadrado es:"+cuadrado);
	}
	public static void rectangulo (int base, int altura) {
		base =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la base del cuadrado:"));
		altura =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la altura del cuadrado:"));
		int cuadrado = (base*altura);
	    JOptionPane.showMessageDialog(null, "El area del cuadrado es:"+cuadrado);
	}


}

	
