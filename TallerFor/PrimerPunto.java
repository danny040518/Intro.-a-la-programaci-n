package TallerFor;

import java.util.Scanner;

public class PrimerPunto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cantidad;
		System.out.println("Ingrese la cantidad de numeros enteros que desee digitar");
		cantidad= sc.nextDouble();
		double suma = 0;
			for(int i = 0; i<cantidad; i++) {
				Scanner sc1 = new Scanner(System.in);
				int num;
				System.out.println("Digite el numero deseado");
				num= sc1.nextInt();
				suma = suma+num;
			}
			double p = suma/cantidad;
			System.out.println("El promedio de los numeros es: "+p);
	}


	}

