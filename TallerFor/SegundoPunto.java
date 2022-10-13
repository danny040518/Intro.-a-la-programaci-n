package TallerFor;

public class SegundoPunto {

	public static void main(String[] args) {
		int suma = 0;
		for(int n = 2 ; n < 100; n++) {
			if(n%2 == 0) {
				suma = suma + n;
			}
		}
		System.out.print("la suma de todos los numeros pares del 2 al 100 es: "+suma);
	}
	}
