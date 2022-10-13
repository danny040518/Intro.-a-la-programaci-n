package TallerFor;

public class TercerPunto {

	public static void main(String[] args) {
		int suma = 0;
		int contador = 0;
		for(int n = 1 ; n <= 100; n++) {
			if(n%2 == 0) {
				suma = suma + n;
				contador++;
			}
		}
		System.out.print("la suma de todos los numeros pares entre 1 y 100 es: "+suma+ "\ny hay "+contador+" numeros");

	}

}
