package TercerCorte;

import javax.swing.JOptionPane;

public class Quiz1 {

	public static void main(String[] args) {
		int numero=0,mayor = 0,menor = 0, ingre = 0,exponente=0,n=0;
		double raiz = 0;
		ingre=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la operacion que desea realizar\n1.Ver el numero mayor\n2.Ver el numeor menor\n3.Calcular la raiz cuadrada\n4.elevar a una potencia"));
		switch(ingre){
		case 1:
			numero_mayor(mayor,n);
			break;
		case 2:
			numero_menor(menor,n);
			break;
		case 3:
			Raiz_cuadrada(numero,raiz);
			break;	
		case 4:
			Potencia(numero, exponente);
			break;	
		}
	}

	public static void numero_mayor (int mayor,int n) {
		n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos numeros desea ingresar para conocer el mayor:"));
		int [] numeros =new int[n];
		for (int i=0; i<numeros.length;i++) {
			numeros [i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato"+(i+1)+"="));
		}
		for (int i=0; i<numeros.length;i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
		}
		}
		JOptionPane.showMessageDialog(null, "El numero mayor es:"+mayor);
	}
	public static void numero_menor (int menor, int n) {
		n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos numeros desea ingresar para conocer el mayor:"));
		int [] numeros =new int[n];
		for (int i=0; i<numeros.length;i++) {
			numeros [i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato"+(i+1)+"="));
		}
		for (int i=0; i<numeros.length;i++) {
			if(numeros[i]<menor) {
				menor=numeros[i];
		}
		}
		JOptionPane.showMessageDialog(null, "El numero mayor es:"+menor);
	}
	public static void Raiz_cuadrada (int numero, double raiz) {
		 numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para calcular la raiz cuadrada:"));
		 raiz = (double) (Math.sqrt(numero));
		JOptionPane.showMessageDialog(null, "La raiz cuadrada de "+numero+" es: "+raiz);
	}
	public static void Potencia (int numero, int exponente) {
		numero =Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la potencia:"));
		exponente =Integer.parseInt(JOptionPane.showInputDialog("Ingresa el exponente al cual deseas elevar la base:"));
		int potencia = (int) (Math.pow(numero, exponente));
	    JOptionPane.showMessageDialog(null, numero+"elevado a la potecnia de "+exponente+" es:"+potencia);
	}
	}
