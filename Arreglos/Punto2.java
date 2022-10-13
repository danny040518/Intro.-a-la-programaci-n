package Arreglos;

public class Punto2{

	public static void main(String[] args) {
		
		int min = 0;
		int max = 100;
		int[] numerosAleatorios = new int[6];
		for(int i=0;i<6;i++) {
			int valorAleatorio = (int) Math.floor(Math.random() * (max - min + 1) ) + min;
			numerosAleatorios[i]=valorAleatorio;
			if(numerosAleatorios[i]%3==0) {
				System.out.println("El numero "+numerosAleatorios[i]+" es multiplo de 3");
			}
		}
		for(int valor : numerosAleatorios) {
			System.out.println("Numero: "+valor);
		}
	}
	}